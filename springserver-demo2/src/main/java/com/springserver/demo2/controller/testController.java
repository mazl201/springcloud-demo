package com.springserver.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Descriptor
 * @ClassName testController
 * @Author Administrator
 * @Date 2018/12/22 13:45
 * @Version 1.0
 */
@RestController
public class testController {

    @GetMapping("/testController")
    @ResponseBody
    public String testController(HttpServletRequest request){
        return "111";
    }
}
