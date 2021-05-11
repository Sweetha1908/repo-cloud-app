package com.cloudapp.dao;

/*
 * An Interface for defining methods in DAO
 */
public interface InstructorDAO {
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
