package com.cloudapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class HomeController {
	
		@RequestMapping("/")
		 public String showview() {
			 return "main-menu";
		 }
}
