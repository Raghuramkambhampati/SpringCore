package org.raghu.springcore.beanclasses;

public class EmployeeConst {
	 private String id;
	  private String name;
	  private String age;
	  private  String address;
	public EmployeeConst(String id, String name, String age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	public void getDetails()
	{
		System.out.println("Employee ID:"+id);
		 System.out.println("Employee Name:"+name);
		 System.out.println("Employee Age:"+age);
		 System.out.println("Employee Address:"+address);
	}
}
