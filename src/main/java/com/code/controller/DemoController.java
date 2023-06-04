package com.code.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订购表 前端控制器
 * </p>
 * @since 2023-06-04
 */
@RestController
@RequestMapping("/")
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "111";
    }
}

