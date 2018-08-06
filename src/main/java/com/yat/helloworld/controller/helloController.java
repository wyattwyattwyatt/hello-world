package com.yat.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@RequestMapping
	public String home() {
		return "home";
	}
	
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}

}
