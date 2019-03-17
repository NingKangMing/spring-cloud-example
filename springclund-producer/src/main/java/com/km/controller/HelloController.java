package com.km.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.km.config.ApplicationProperties;

@RestController
public class HelloController {
	
	@Autowired
	private ApplicationProperties app;

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello "+name+"，this is first messge,"+app.getName();
	}
}
