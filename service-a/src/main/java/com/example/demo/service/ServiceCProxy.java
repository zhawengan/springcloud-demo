package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: zwg
 * @Date: 2019/3/19 18:10
 * @Description:
 */
@FeignClient(value = "service-c")
public interface ServiceCProxy {
    @RequestMapping(value = "price/info", method = RequestMethod.POST)
    String getPrice();


}
