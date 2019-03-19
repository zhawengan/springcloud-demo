package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zwg
 * @Date: 2019/3/19 15:18
 * @Description:
 */
@RestController
@RequestMapping("price")
public class ProductPriceController {
    @RequestMapping("info")
    public String getPrice(){
        return "product price is 10￥";
    }
}
