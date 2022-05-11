package com.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.*;

@Controller
public class homecontroller {
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}

}
