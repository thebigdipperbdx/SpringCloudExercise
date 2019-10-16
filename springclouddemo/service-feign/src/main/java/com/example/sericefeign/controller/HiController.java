package com.example.sericefeign.controller;

import com.example.sericefeign.client.InvokeServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanyugang
 * @description
 * @date 2019-10-16 14:51
 */
@RestController
public class HiController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    InvokeServiceHello invokeServiceHello;

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name) {
        return invokeServiceHello.sayHelloFromServiceHello(name);
    }

    @GetMapping(value = "/sayFine")
    public String sayFine(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name) {
        return invokeServiceHello.sayFineFromServiceHello(name);
    }
}
