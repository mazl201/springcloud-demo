package com.springserverexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Descriptor
 * @ClassName testController2
 * @Author Administrator
 * @Date 2018/12/22 14:12
 * @Version 1.0
 */
@RestController
public class testController2 {

    @RequestMapping("testController")
    @ResponseBody
    public String testController(HttpServletRequest request){
        return "2222";
    }
}
