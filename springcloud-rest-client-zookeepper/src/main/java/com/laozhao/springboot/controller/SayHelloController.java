package com.laozhao.springboot.controller;

import com.laozhao.springboot.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viruser on 2018/8/14.
 */
@RestController
public class SayHelloController {

    @Autowired
    private SayHelloService  sayHelloService;

    @RequestMapping("/hi")
    public String  sayHello(String name){
        return sayHelloService.sayHiFromClientOne(name);
    }

}
