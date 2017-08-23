package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.po.TestPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongweizhao on 17/8/22.
 */
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<TestPo> getAll(){
        return testMapper.getAll();
    }
}
