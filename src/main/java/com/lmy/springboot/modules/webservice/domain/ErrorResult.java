package com.lmy.springboot.modules.webservice.domain;

import lombok.Data;

/**
 * @Package: com.lmy.springboot.modules.soap.domain
 * @Description:
 * @Author: linmy
 * @Date: 2020/9/16
 */
@Data
public class ErrorResult {
    private String resultCode;
    private String errMsg;
    private String wrapperException;
}
