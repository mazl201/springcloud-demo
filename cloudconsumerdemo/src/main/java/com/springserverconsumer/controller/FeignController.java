package com.springserverconsumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Descriptor
 * @ClassName FeignController
 * @Author Administrator
 * @Date 2018/12/22 13:31
 * @Version 1.0
 */
@FeignClient(value ="compute-service")
public class FeignController {

    @GetMapping("getCususerInfo")
    @ResponseBody
    public String  getCususerInfo(HttpServletRequest request){
        return "suc";
    }
}
