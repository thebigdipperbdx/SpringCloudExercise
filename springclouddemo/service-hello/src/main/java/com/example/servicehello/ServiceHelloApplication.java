package com.example.servicehello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanyugang
 * @description eureka client 服务提供者
 * @date 2019-10-14 14:57
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHelloApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceHelloApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/fine")
    public String sayFine(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name) {
        return "hi " + name + " , i am fine , i am from port:" + port;
    }

}
