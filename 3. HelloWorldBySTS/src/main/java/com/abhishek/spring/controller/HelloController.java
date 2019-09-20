package com.abhishek.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value="/welcome")
	public String hello()
	{
		return "Welcome To STS";
	}

}
