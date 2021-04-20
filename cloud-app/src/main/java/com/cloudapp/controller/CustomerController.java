package com.cloudapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudapp.vo.Customer;



@Controller
@RequestMapping("/customer")
public class CustomerController {

		@RequestMapping("/showForm")
		public String showForm(Model theModel) {
			theModel.addAttribute("customer", new Customer());
			return "customer_form";
		}
		@RequestMapping("/processForm")
		public String processForm ( 
				 @Valid  Customer theCustomer, BindingResult theBindingResult) {
			System.out.println("LastName : |"+ theCustomer.getLastName() + "|");
			
			if(theBindingResult.hasErrors()) {
				return "customer_form";
			}
			else {
			return "customer_confirmation";
		}
		}
}
