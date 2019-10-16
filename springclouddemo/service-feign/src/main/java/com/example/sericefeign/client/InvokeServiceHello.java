package com.example.sericefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yanyugang
 * @description
 * @date 2019-10-16 14:46
 */
//服务名
@FeignClient("service-hello")
public interface InvokeServiceHello {
    // URL名称
    @RequestMapping(value = "/hello")
    String sayHelloFromServiceHello(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name);

    // URL名称
    @RequestMapping(value = "/fine")
    String sayFineFromServiceHello(@RequestParam(value = "name", defaultValue = "Jing Tianming") String name);
}
