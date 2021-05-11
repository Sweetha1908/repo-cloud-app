package com.cloudapp.service;

/*
 * An interface of InstructorService to define methods
 */
public interface InstructorService {

	// defining methods
	void saveInstructor();

	void deleteInstructor(int instructorId);

	void getInstructor();

	void saveInstructorDetails();

	void deleteInstructorDetails(int instructoDetailsId);

	void getInstructorDetails(int instructorDetailsId);

	void saveCourses();

	void deleteCourses(int courseId);

	void getCourses(int courseId);

	void doLazyLoading();

}
