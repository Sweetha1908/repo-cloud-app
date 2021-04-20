package com.cloudapp.vo;

import java.util.LinkedHashMap;

public class Student {
private String firstName;
private String lastName;
private String country;
private String favouriteLanguage;
private String[] operatingSystem;

public String getFavouriteLanguage() {
	return favouriteLanguage;
}
public void setFavouriteLanguage(String favouriteLanguage) {
	this.favouriteLanguage = favouriteLanguage;
}
private LinkedHashMap<String,String> countryOptions;
public Student() {
	countryOptions = new LinkedHashMap<>();
	countryOptions.put("IN", "INDIA");
	countryOptions.put("BR", "Brazil");
	countryOptions.put("FR", "France");
	countryOptions.put("DE", "Germany");
}
public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
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
public String[] getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String[] operatingSystem) {
	this.operatingSystem = operatingSystem;
}
}