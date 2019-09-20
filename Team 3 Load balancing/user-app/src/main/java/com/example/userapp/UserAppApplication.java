package com.example.userapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name="RibbonDemo" , configuration=ClientAppConfiguration.class)
@RestController
public class UserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

	@LoadBalanced //to interact with services
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/myapp" , method=RequestMethod.GET)
	public String myApp() {
		return this.restTemplate.getForObject("http://RibbonDemo/helloworld", String.class);
	}
	
}
