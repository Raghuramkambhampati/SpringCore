package com.raghu.SpringCore.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.SpringCore.beanclasses.Employee;

public class AutowireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Config.xml");
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println("Employee ID:"+emp1.getId());
		System.out.println("Employee FirstName:"+emp1.getFirstname());
		System.out.println("Employee LastName:"+emp1.getLastName());
		System.out.println("Employee Mobile:"+emp1.getMobile());
		System.out.println("Employee Email:"+emp1.getEmail());
		System.out.println("Employee Department Name:"+emp1.getDep().getName());
		System.out.println("Employee Department Location:"+emp1.getDep().getLocation());
		System.out.println("Employee Department HOD:"+emp1.getDep().getHod());
		Employee emp2=(Employee) context.getBean("emp2");
		System.out.println("Employee ID:"+emp2.getId());
		System.out.println("Employee FirstName:"+emp2.getFirstname());
		System.out.println("Employee LastName:"+emp2.getLastName());
		System.out.println("Employee Mobile:"+emp2.getMobile());
		System.out.println("Employee Email:"+emp2.getEmail());
		System.out.println("Employee Department Name:"+emp2.getDep().getName());
		System.out.println("Employee Department Location:"+emp2.getDep().getLocation());
		System.out.println("Employee Department HOD:"+emp2.getDep().getHod());
	}

}
