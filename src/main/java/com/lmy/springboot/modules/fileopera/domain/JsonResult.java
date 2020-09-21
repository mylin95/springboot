package com.lmy.springboot.modules.fileopera.domain;

/**
 * ClassName JsonResult
 * Package com.lmy.springboot.modules.fileopera.domain
 * Description 返回信息实体
 * @author linmy
 * @date 2020-9-18 16:20:19
 * @version V1.0
 */
public class JsonResult {
    /**
     * 0：正常
     * 1：异常
     */
    private int code;

    /**
     * 返回信息
     */
    private String message;

    public JsonResult() {
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
