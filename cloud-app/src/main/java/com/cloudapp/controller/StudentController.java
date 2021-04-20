package com.cloudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudapp.vo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent =new Student();
		theModel.addAttribute("student", theStudent);
		return"student_form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("theStudent: "+theStudent.getFirstName()
							+ " " +theStudent.getLastName());
		return "student_confirmation";
	}
}
