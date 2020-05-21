package com.hari.udemy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.udemy.modal.Order1;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String helloWorld()
	{
		return"hello world";
		
	}

	/*
	 * @RequestMapping("/hello2") public Order1 helloWorld2() { return new
	 * Order1("hari", "k", "hyd");
	 * 
	 */
	
}
