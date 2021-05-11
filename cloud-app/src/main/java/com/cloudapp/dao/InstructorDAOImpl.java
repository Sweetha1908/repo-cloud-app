package com.cloudapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudapp.entity.Course;
import com.cloudapp.entity.Instructor;
import com.cloudapp.entity.InstructorDetail;

/*
 * A DAO Implementation class which implements instructorDAO interface 
 */
@Repository
public class InstructorDAOImpl implements InstructorDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveInstructor() {
		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// create the objects
			Instructor tempInstructor = new Instructor("priya", "L", "priya@gmail.com");

			InstructorDetail tempInstructorDetail = new InstructorDetail("tamilnadu", "piano");

			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);

			// start a transaction
			session.beginTransaction();

			// save the instructor
			//
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL
			//
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			sessionFactory.close();
		}

	}

	@Override
	public void deleteInstructor(int instructorId) {
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get instructor by primary key / id
			int theId = 2;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			System.out.println("Found instructor: " + tempInstructor);

			// delete the instructors
			if (tempInstructor != null) {

				System.out.println("Deleting: " + tempInstructor);

				// Note: will ALSO delete associated "details" object
				// because of CascadeType.ALL
				//
				session.delete(tempInstructor);
			}

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			sessionFactory.close();
		}
	}

	@Override
	public void getInstructor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveInstructorDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInstructorDetails(int instructoDetailsId) {
		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the instructor detail object
			int theId = 3;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);

			// print the instructor detail
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);

			// print the associated instructor
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());

			// now let's delete the instructor detail
			System.out.println("Deleting tempInstructorDetail: " + tempInstructorDetail);

			// remove the associated object reference
			// break bi-directional link

			tempInstructorDetail.getInstructor().setInstructorDetail(null);

			session.delete(tempInstructorDetail);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			// handle connection leak issue
			session.close();

			sessionFactory.close();
		}

	}

	@Override
	public void getInstructorDetails(int instructorDetailsId) {
		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the instructor detail object
			int theId = 2999;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);

			// print the instructor detail
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);

			// print the associated instructor
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			// handle connection leak issue
			session.close();

			sessionFactory.close();
		}

	}

	@Override
	public void saveCourses() {
		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			// create some courses
			Course tempCourse1 = new Course("Spring tutorial");
			Course tempCourse2 = new Course("JSP, Servlets");

			// add courses to instructor
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);

			// save the courses
			session.save(tempCourse1);
			session.save(tempCourse2);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			sessionFactory.close();
		}

	}

	@Override
	public void deleteCourses(int courseId) {
		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get a course
			int theId = 10;
			Course tempCourse = session.get(Course.class, theId);

			// delete course
			System.out.println("Deleting course: " + tempCourse);

			session.delete(tempCourse);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			sessionFactory.close();
		}

	}

	@Override
	public void getCourses(int courseId) {
		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			System.out.println("Instructor: " + tempInstructor);

			// get courses for the instructor
			System.out.println("Courses: " + tempInstructor.getCourses());

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			sessionFactory.close();
		}
	}

	@Override
	public void doLazyLoading() {

		// create session
		Session session = sessionFactory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			System.out.println("Instructor: " + tempInstructor);

			System.out.println("Courses: " + tempInstructor.getCourses());

			// commit transaction
			session.getTransaction().commit();

			// close the session
			session.close();

			System.out.println("\n The session is now closed!\n");

			// option 1: call getter method while session is open

			// get courses for the instructor
			System.out.println(" Courses: " + tempInstructor.getCourses());

			System.out.println(" Done!");
		} finally {

			// add clean up code
			session.close();

			sessionFactory.close();
		}

	}

}
