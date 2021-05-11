package com.cloudapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * entity class for instructor detail table
 */
//annotate the class as an entity and map to db table
@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

	// define the fields

	// annotate the fields with db column names
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "Address")
	private String address;

	@Column(name = "hobby")
	private String hobby;

	// add new field for instructor (also add getter/setters)

	// add @OneToOne annotation

	@OneToOne(mappedBy = "instructorDetail", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private Instructor instructor;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	// create constructors
	public InstructorDetail() {

	}

	public InstructorDetail(String Address, String hobby) {
		this.address = Address;
		this.hobby = hobby;
	}

	// generate getter/setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	// generate toString() method
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", Address=" + address + ", hobby=" + hobby + "]";
	}
}