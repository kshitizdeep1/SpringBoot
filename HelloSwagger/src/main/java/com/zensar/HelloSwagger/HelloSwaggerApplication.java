package com.zensar.HelloSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2
public class HelloSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSwaggerApplication.class, args);
	}  
	@Bean
	public Docket swaggerDemoApp()
	{
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.zensar")).build();
		
	}
@RequestMapping(value="demo",method=RequestMethod.GET)
public String demo1() {
	return "success";
}


@RequestMapping(value="postapidemo",method=RequestMethod.POST)
public String postapidemo(@RequestBody Demo demo) {
	System.out.println("post api demo id"+demo.getDemo_id());
	System.out.println("post api demo id"+demo.getDemo_name());
	return "post api successful";
}
}
