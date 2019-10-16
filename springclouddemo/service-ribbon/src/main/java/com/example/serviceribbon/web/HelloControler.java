package com.example.serviceribbon.web;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanyugang
 * @description
 * @date 2019-10-14 15:56
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/hello")
    public String hi(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name){
        return helloService.hiService(name);
    }
}

