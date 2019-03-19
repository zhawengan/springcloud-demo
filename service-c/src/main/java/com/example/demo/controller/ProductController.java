package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zwg
 * @Date: 2019/3/19 16:08
 * @Description:
 */
@RestController
@RequestMapping("product")
public class ProductController {
    @RequestMapping("detail")
    public String getDetail(){
        return "this is from service-c product detial";
    }
}
