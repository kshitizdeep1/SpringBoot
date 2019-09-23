package com.ticketbooking.controller;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.station.userservice.UserService;
import com.user.User;

public class TicketBookingController {
	@Autowired
	private UserService userService;
	
	//@PostMapping(value="/create")
	//public User createUser(@RequestParam("firstname")  String firstName,@RequestParam("lastname")
	 /*String lastName,@RequestParam("gender") String gender,@RequestParam("phone") Long phoneNumber,@RequestParam("email") String email,
	 @RequestParam("address") String address,@RequestParam("password") String password,@RequestParam("age") int age)
	{
		System.out.println(address);
		User user=new User(firstName,lastName,gender,email,password,age,phoneNumber,address);
		return userService.addUser(user);
	}*/
	
	
	//@GetMapping(value="/{userId}/{password}")
	@PostMapping(value="/test")
	public String validateUser(@RequestParam("user") Long userid,@RequestParam("password") String password)
	{
		
		return userService.validateUser(userid,password);
	}
	
	//@PostMapping(value="/create")
	@RequestMapping(method=RequestMethod.POST)
	public User createUser(@ModelAttribute("sign") User user,Map<String,Object> model) {
		System.out.println(user.getFirstName());
		return userService.addUser(user);
	}
	
	//@RequestMapping(method=RequestMethod.POST)
	public String sayHello() {
		return "hello";
	}
	
	
}
