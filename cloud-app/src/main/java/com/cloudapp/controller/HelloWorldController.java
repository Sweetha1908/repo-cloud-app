package com.cloudapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
			@RequestMapping("/showForm")
			public String showForm() {
				return "helloworld_form";
			}
			@RequestMapping("/processForm")
			public String processForm() {
				return "hello_world";
			}
			@RequestMapping("/processFormTwo")
			public String addData(HttpServletRequest request,Model model) {
				
				String theName = request.getParameter("studentName");
				
				String result = "Hello Student :" + theName;
				model.addAttribute("message",result);
				return "hello_world";
			}
			@RequestMapping("/processFormThree")
			public String addDataTwo(@RequestParam("studentName") String theName, Model model) {
		
				String result = "Hello Student :" + theName;
				model.addAttribute("message",result);
				return "hello_world";
			}
}
