package com.zensar.HelloSwagger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/api")
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
	ConcurrentMap<String, Demo> demo=new ConcurrentHashMap<String, Demo>() ;
@GetMapping("/{demo_id}")
public Demo getDemo1(@PathVariable String id) {
	return demo.get(id);
}
@GetMapping("/list1")
public List<Demo>getAllDemo()
{
	return new ArrayList<Demo>(demo.values());
}
@PostMapping("/post1")
public Demo postapidemo(@RequestBody Demo demo1) {
	demo.put(demo1.getDemo_id(),demo1);
	return demo1;
}
@RequestMapping(value = "/{id}", method= RequestMethod.GET,produces="application/json")
public Demo showProduct(@PathVariable String id){

    return demo.get(id);
}

@RequestMapping(value="/list",method= RequestMethod.GET,produces="application/json")
public List getAllDemo1()
{
	return new ArrayList<Demo>(demo.values());
}

@RequestMapping(value="post",method=RequestMethod.POST,produces="application/json", consumes="application/json")

public Demo postapidemo1(@RequestBody Demo demo2) {

	demo.put(demo2.getDemo_id(),demo2 );
	
	return demo2;
}

}
