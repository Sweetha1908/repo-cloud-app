package com.cloudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudapp.service.InstructorService;
/*
 * A controller class 
 */
@Controller
@RequestMapping("/mapping")
public class InstructorController {

	@Autowired
	private InstructorService instructorService;
	
	@RequestMapping("/getInstructorDetails/{instructorDetailsId}")
	public String getInstructorDetails(@PathVariable("instructorDetailsId")int instructorDetailsId) {
		
		instructorService.getInstructorDetails(instructorDetailsId);
		 return "success";
	}
	
	@RequestMapping("/saveInstructor")
	public String saveInstructor() {
		instructorService.saveInstructor();
		return "success";
		
	}
	
	@RequestMapping("/deleteInstructor/{instructorId}")
	public String deleteInstructor(@PathVariable("instructorId")int instructorId) {
		instructorService.deleteInstructor(instructorId);
		return "success";
	} 
	
	@RequestMapping("/getInstructor")
	public String getInstructor() {
		instructorService.getInstructor();
		return "success";
	}
	
	@RequestMapping("/saveInstructorDetails")
	public String saveInstructorDetails() {
		instructorService.saveInstructorDetails();
		return "success";
	}
	
	@RequestMapping("/deleteInstructor/{instructoDetailsId}")
	public String deleteInstructorDetails(@PathVariable("instructoDetailsId")int instructoDetailsId)  {
		instructorService.deleteInstructorDetails(instructoDetailsId);
		return "success";
	} 
	
	@RequestMapping("/SaveCourses")
	public String saveCourses() {
		instructorService.saveCourses();
		return "success";
	}
	
	@RequestMapping("/deleteCourse/{courseId}")
	public String deleteCourses(@PathVariable("courseId")int courseId) {
		instructorService.deleteCourses(courseId);
		return "success";
	}
	
	@RequestMapping("/getCourses/{courseId}")
	public String getCourses(@PathVariable("courseId")int courseId) {
		instructorService.getCourses(courseId);
		return "success";
	}
	
}
