package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zwg
 * @Date: 2019/3/19 15:16
 * @Description:
 */
@RestController
@RequestMapping("product")
public class ProductController {
    @RequestMapping("detail")
    public String getDetail(){
        return "product detail";
    }
}
