package com.zensar.ashw.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.ashw.springdemo.configuration.DbConfiguration;

@RestController
public class SpringdemoController {
	
	//public static String msg;
	@RequestMapping("/test")
	public String hello()
	{	
		
		
		return "msg";
	}

}
