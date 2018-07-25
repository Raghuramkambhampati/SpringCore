package com.raghu.SpringCore.beanclasses;

public class Employee {
	private String id;
	private String firstname;
	private String lastName;
	private String mobile;
	private String email;
	private Department dep;
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
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	

}
