package com.lmy.springboot.base.mybatis;

import com.github.pagehelper.IPage;

public class PageParam implements IPage {
    public PageParam() {

    }

    public PageParam(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    /**
     * 页码：从 1 开始(默认 1)
     */
    private Integer pageNum = 1;
    /**
     * 每页数量(默认 10)
     */
    private Integer pageSize = 10;
    /**
     * 排序字段
     */
    private String orderBY;

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setOrderBY(String orderBY) {
        this.orderBY = orderBY;
    }

    @Override
    public Integer getPageNum() {
        return pageNum;
    }

    @Override
    public Integer getPageSize() {
        return pageSize;
    }

    @Override
    public String getOrderBy() {
        return orderBY;
    }

    @Override
    public String toString() {
        return "PageParam{" + "pageNum=" + pageNum + ", pageSize=" + pageSize + ", orderBY='" + orderBY + '\'' + '}';
    }
}
