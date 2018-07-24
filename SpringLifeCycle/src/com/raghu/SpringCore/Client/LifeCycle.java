package com.raghu.SpringCore.Client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.SpringBeanClasses.Employee;
import com.raghu.SpringBeanClasses.teacher;

public class LifeCycle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Config.xml");
		Employee emp1=(Employee) context.getBean("empsetter");
		System.out.println("Employee ID:"+emp1.getId());
		System.out.println("Employee First Name:"+emp1.getFirstname());
		System.out.println("Employee Last Name:"+emp1.getLastName());
		System.out.println("Employee Mobile:"+emp1.getMobile());
		System.out.println("Employee Email:"+emp1.getEmail());
		emp1.destroy();
		teacher emp2=(teacher) context.getBean("empmethod");
		System.out.println("Employee ID:"+emp2.getId());
		System.out.println("Employee First Name:"+emp2.getFirstname());
		System.out.println("Employee Last Name:"+emp2.getLastName());
		System.out.println("Employee Mobile:"+emp2.getMobile());
		System.out.println("Employee Email:"+emp2.getEmail());
		emp2.close();
	}

}
