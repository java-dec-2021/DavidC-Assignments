package com.dcogbill.HelloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	
	@RequestMapping("/")
	public String index(@RequestParam(required = false, name = "fn") String firstName, @RequestParam(required = false, name = "ln") String lastName) {
		if (firstName == null)
			return "Hello Human";
		return "Hello " + firstName + " " + lastName;
	}

}
