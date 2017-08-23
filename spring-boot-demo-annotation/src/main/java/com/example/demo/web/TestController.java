package com.example.demo.web;

import com.example.demo.po.TestPo;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dongweizhao on 17/8/22.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/getAll")
    List<TestPo> getAll() {
        return testService.getAll();
    }
}
