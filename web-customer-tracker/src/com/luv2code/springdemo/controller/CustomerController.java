package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("/")
	public String index(Model theModel) {
		return "index";
		
	}
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		return "list-customers";
	}
}
