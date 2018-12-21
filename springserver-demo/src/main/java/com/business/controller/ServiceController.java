package com.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descriptor
 * @ClassName ServiceController
 * @Author Administrator
 * @Date 2018/12/21 11:11
 * @Version 1.0
 */
@RestController
public class ServiceController {

    @GetMapping("/acquireCustomerInfo")
    public String acquireCustomerInfo(){
        return "已经获取到 信息";
    }
}
