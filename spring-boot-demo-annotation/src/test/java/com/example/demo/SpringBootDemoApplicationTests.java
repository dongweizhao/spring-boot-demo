package com.example.demo;

import com.example.demo.mapper.TestMapper;
import com.example.demo.po.TestPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class SpringBootDemoApplicationTests {
	@Autowired
	private TestMapper testMapper;
	@Test
	public void contextLoads() {
	}

	@Test
	public void queryTest()throws Exception{
		List<TestPo> list=testMapper.getAll();
		System.out.println(list.toString());
	}

}
