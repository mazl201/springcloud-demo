package com.springserverconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descriptor
 * @ClassName ConsumerController
 * @Author Administrator
 * @Date 2018/12/21 11:56
 * @Version 1.0
 */
@RestController
public class ConsumerController {



    @GetMapping("/consumer")
    public String getConsumer(){
        return "consumer";
    }

}
