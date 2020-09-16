package com.lmy.springboot.modules.java.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ProjectName: cmdb-soc-service
 * @Package: com.ffcs.iod.app.modules.soc.domain.dto
 * @ClassName: Baseline
 * @Description: 基线检查结果
 * @Author: linmy
 * @Date: 2020/3/3
 * @Version: 1.0
 */
@Data
public class Baseline {

    @ApiModelProperty(value = "基线名")
    private String name;
    @ApiModelProperty(value = "标识，标示，主机填写系统类型（windows、linux等) 数据库填写端口（3306）中间件填写“‘路径’|‘端口’”,格式固定", example = "/opt/tomcat|8080")
    private String uid;
    @ApiModelProperty(value = "类型（os、mw、db）")
    private String type;
    @ApiModelProperty(value = "检查时间")
    private String time;
    @ApiModelProperty(value = "基线检查的数据")
    private String data;
}
