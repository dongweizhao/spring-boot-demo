package com.example.demo.web;

import com.example.demo.po.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongweizhao on 17/8/22.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/getUser")
    User getUser() {
        return new User("李四222","男",10);
    }
}
