package com.example.demo.mapper;

import com.example.demo.po.TestPo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dongweizhao on 17/8/22.
 */
public interface TestMapper {
    @Select("SELECT * FROM test")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name")
    })
    List<TestPo> getAll();
}
