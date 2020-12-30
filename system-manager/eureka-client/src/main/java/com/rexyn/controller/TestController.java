package com.rexyn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Author: sheldon
 * @Date: 2020/12/11
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/say")
    public String say(){
        return "hello springCloud~~";
    }
}
