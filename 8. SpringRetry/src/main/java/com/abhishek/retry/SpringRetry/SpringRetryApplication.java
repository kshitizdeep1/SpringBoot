package com.abhishek.retry.SpringRetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableRetry
/*
 * For running this use
 * http://localhost:8081/
 */
public class SpringRetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRetryApplication.class, args);
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	@Retryable(value= {NumberFormatException.class,NullPointerException.class},maxAttempts=3)
	public String myApp()
	{
		System.out.println("My App Api is calling...");
		Integer.parseInt("");
		String str=null;
		str.length();
		return "Success";
	}
	
	@Recover
	public String recover(NumberFormatException ex)
	{
		System.out.println("Recover method- Number Format Exception");
		return "Recover method- Number Format Exception";
	}
	
	@Recover
	public String recover(NullPointerException ne)
	{
	System.out.println("Recover method-Null Pointer Eception");
	return "Recover method-Null Pointer Eception";
	}
	
}
