package com.examples.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.examples.springmvc.customvalidation.CourseCode;


public class Customer 
{
	private String firstName;
	
	@NotNull(message="This field is required & cannot be null")
	@Size(min=1,message="This field is required")
	private String lastName;
	
	@NotNull(message="This field is required & cannot be null")
	@Min(value=0,message="must not be greater than or equal to zero")
	@Max(value=10,message="must not be greater than or equal to ten")
	private Integer freePasses;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5chars/digits")
	private String postalCode;
	
	
	@CourseCode(value="UDMY",message="must start with UDMY")
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
}
