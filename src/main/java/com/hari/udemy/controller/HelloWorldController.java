package com.hari.udemy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.udemy.modal.UserDetails;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String helloWorld()
	{
		return"hello world";
		
	}

	@RequestMapping("/hello2")
	public UserDetails helloWorld2()
	{
		return new UserDetails("hari", "k", "hyd");
		
	}
	
}
