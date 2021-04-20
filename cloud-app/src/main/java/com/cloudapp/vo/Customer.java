package com.cloudapp.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	@NotNull
	@Size(max=3,message="over Loaded")
	private  String firstName;
	
	@NotNull()
	@Size(min=1,message="is required")
	private String lastName;
	
	@Min(value=0, message="should be greater than one")
	@Max(value=10, message="should be less than 10")
	private int freePasses;
	
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
