package com.gong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeSniper
 * @since 2021-06-27
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello,world";
    }
}
