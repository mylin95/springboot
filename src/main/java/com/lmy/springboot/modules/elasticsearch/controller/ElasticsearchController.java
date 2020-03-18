package com.lmy.springboot.modules.elasticsearch.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.lucene.util.QueryBuilder;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/es")
@Api(tags = "elasticsearch easy demo")
public class ElasticsearchController {

    @Autowired
    private TransportClient client;

    @GetMapping("")
    public String index() {
        return "index";
    }

    /**
     * 根据id获取book索引的novel类型的文档
     * @param id
     * @return
     */
    @ApiOperation(value = "query", notes = "get novel by id")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "novel`id", required = true, example = "1")})
    @GetMapping("/get/book/novel")
    public ResponseEntity get(@RequestParam(name = "id", defaultValue = "1") String id) {

        if (id.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        GetResponse result = this.client.prepareGet("book", "novel", id).get();
        if (!result.isExists()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(result.getSource(), HttpStatus.OK);
    }

    /**
     * 增
     * @param title
     * @param author
     * @param word_count
     * @param publish_date
     * @return
     */
    @PostMapping("/add/book/novel")
    public ResponseEntity add(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "author") String author,
            @RequestParam(name = "word_count") int word_count,
            @RequestParam(name = "publish_date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date publish_date
    ) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            XContentBuilder content = XContentFactory.jsonBuilder()
                    .startObject()
                    .field("title", title)
                    .field("author", author)
                    .field("word_count", word_count)
                    .field("publish_date", sdf.format(publish_date))
                    .endObject();
            IndexResponse result = this.client.prepareIndex("book", "novel")
                    .setSource(content)
                    .get();
            return new ResponseEntity(result.getId(), HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 删 —— 根据id
     * @param id
     * @return
     */
    @DeleteMapping("/delete/book/novel")
    public ResponseEntity delete(@RequestParam(name = "id") String id) {
        DeleteResponse result = this.client.prepareDelete("book", "novel", id)
                .get();
        return new ResponseEntity(result.getResult().toString(), HttpStatus.OK);
    }

    /**
     * 改
     * @param id
     * @param title
     * @param author
     * @return
     */
    @PutMapping("/update/book/novel")
    public ResponseEntity update(
            @RequestParam(name = "id") String id,
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "author", required = false) String author
    ) {

        UpdateRequest update = new UpdateRequest("book", "novel", id);
        try {
            XContentBuilder builder = XContentFactory.jsonBuilder()
                    .startObject();
            if (title != null) {
                builder.field("title", title);
            }
            if (author != null) {
                builder.field("author", author);
            }

            builder.endObject();
            update.doc(builder);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        try {
            UpdateResponse result = this.client.update(update).get();
            return new ResponseEntity(result.getResult().toString(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    /**
     * 查 —— 根据范围
     * @param author
     * @param title
     * @param gtWordCount
     * @param ltWordCount
     * @return
     */
    @PostMapping("/query/book/novel")
    public ResponseEntity query(
            @RequestParam(name = "author", required = false) String author,
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "gt_word_count", defaultValue = "0") int gtWordCount,
            @RequestParam(name = "lt_word_count", required = false) Integer ltWordCount
    ) {
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();

        if (author != null) {
            boolQuery.must(QueryBuilders.matchQuery("author", author));
        }

        if (title != null) {
            boolQuery.must(QueryBuilders.matchQuery("title", title));
        }

        RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery("word_count").from(gtWordCount);
        if (ltWordCount != null && ltWordCount > 0) {
            rangeQuery.to(ltWordCount);
        }

        boolQuery.filter(rangeQuery);

        SearchRequestBuilder builder = this.client.prepareSearch("book", "book")
                .setTypes("novel")
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
                .setQuery(boolQuery)
                .setFrom(0)
                .setSize(10);

        System.out.println(builder);

        SearchResponse response = builder.get();
        List<Map<String, Object>> result = new ArrayList<>();
        for (SearchHit hit : response.getHits()) {
            result.add(hit.getSourceAsMap());
        }

        return new ResponseEntity(result, HttpStatus.OK);
    }

}
