package com.zensar.FirstGradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystrixController
{
	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod="myfallBack")
 public String print()
 {
	 return "Hello from this side";
 }
	
	public String myfallBack()
	{
		return "hello";
	}
	
}
