package com.izhipeng.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.izhipeng.test.service.TestService;

@Controller
public class IndexController {
	private static Logger logger =Logger.getLogger(IndexController.class);
	
	@Autowired
	private TestService testService;
	
	//viewn 使用jsp 要注释掉vm
	@RequestMapping("/hello")
	public String hello(Map<String,String> map){
		logger.info(testService.select().getName());
		map.put("name", "jacksong");
		return "test";
	}
	
	//vm
	@RequestMapping("/hello2")
	public String hello2(Map<String,Object> map){
		logger.info(testService.select().getName());
		List<String> l = new ArrayList<>();
		l.add("ddd");
		l.add("ggh");
		map.put("data", l);
		return "test";
	}
}
