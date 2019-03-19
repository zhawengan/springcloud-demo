package com.example.demo.controller;

import com.example.demo.service.ServiceCProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zwg
 * @Date: 2019/3/18 16:43
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class ServiceAController {
    @Autowired
    private ServiceCProxy proxy;
    @RequestMapping("/name")
    public String getAResult(){
        return "Service A";
    }

    @RequestMapping("product/price")
    public String getPrice(){
        return proxy.getPrice();
    }

    public String fallback(){
        return "fallback";
    }
}
