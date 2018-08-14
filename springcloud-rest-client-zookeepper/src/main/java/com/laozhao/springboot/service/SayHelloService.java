package com.laozhao.springboot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by viruser on 2018/8/14.
 */
@FeignClient(value = "zookeeper-gateway")
public interface SayHelloService {
    @RequestMapping(value = "/foo/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
