package com.izhipeng.test.controller;

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
	
	//view
	@RequestMapping("/hello")
	public String hello(){
		logger.info(testService.select().getName());
		return "test";
	}
	
}
