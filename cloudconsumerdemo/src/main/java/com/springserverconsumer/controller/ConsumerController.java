package com.springserverconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @Descriptor
 * @ClassName ConsumerController
 * @Author Administrator
 * @Date 2018/12/21 11:56
 * @Version 1.0
 */
@Controller
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer")
    @ResponseBody
    public String getConsumer(){
        return "consumer";
    }

}
