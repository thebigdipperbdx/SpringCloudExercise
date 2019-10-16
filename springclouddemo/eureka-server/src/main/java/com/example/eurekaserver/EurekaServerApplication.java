package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yanyugang
 * @description eureka server 服务注册中心
 * @date 2019-10-14 14:18
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
