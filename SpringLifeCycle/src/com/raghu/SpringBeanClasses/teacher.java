package com.raghu.SpringBeanClasses;

public class teacher {
	
	private String id;
	private String firstname;
	private String lastName;
	private String mobile;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void init() {
    	System.out.println("This is teacher init method");
    }
	
	public void close() {
		System.out.println("This is teacher destroy");
	}

}
