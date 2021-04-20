package com.cloudapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("//hello")
public class HelloWorldController {
	// controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	// controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	// controller method to read form data and
		// add data to the model

	@RequestMapping("/processFormTwo")
	public String anotherMethod(HttpServletRequest request,Model model) {
		// read the request parameter from the HTML form
		String theName=request.getParameter("studentName");
		// convert the data to all caps
		theName=theName.toUpperCase();
		// create the message
		String result="Hi! "+theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	@RequestMapping("/processFormThree")
	public String anotherParamMethod(@RequestParam("studentName") String theName,Model model) {
		// convert the data to all caps
		theName=theName.toUpperCase();
		// create the message
		String result="Hi! "+theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}

}
