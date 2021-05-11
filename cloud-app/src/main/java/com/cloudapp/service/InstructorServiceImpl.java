package com.cloudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudapp.dao.InstructorDAO;

/*
 * A Service Implementation class which implements instructor service interface
 */
@Service
public class InstructorServiceImpl implements InstructorService {

	// defining a field
	@Autowired
	private InstructorDAO instructorDAO;

	@Override
	public void saveInstructor() {
		instructorDAO.saveInstructor();

	}

	@Override
	public void deleteInstructor(int instructorId) {
		instructorDAO.deleteInstructor(instructorId);

	}

	@Override
	public void getInstructor() {
		instructorDAO.getInstructor();

	}

	@Override
	public void saveInstructorDetails()  {
		instructorDAO.saveInstructorDetails();
	}

	@Override
	public void deleteInstructorDetails(int instructoDetailsId) {
		instructorDAO.deleteInstructorDetails(instructoDetailsId);

	}

	@Override
	public void getInstructorDetails(int instructorDetailsId) {
		instructorDAO.getInstructorDetails(instructorDetailsId);

	}

	@Override
	public void saveCourses() {
		instructorDAO.saveCourses();

	}

	@Override
	public void deleteCourses(int courseId) {
		instructorDAO.deleteCourses(courseId);

	}

	@Override
	public void getCourses(int courseId) {
		instructorDAO.getCourses(courseId);

	}

	@Override
	public void doLazyLoading() {
		instructorDAO.doLazyLoading();

	}

}