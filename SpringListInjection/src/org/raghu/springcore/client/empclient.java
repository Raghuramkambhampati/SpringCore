package org.raghu.springcore.client;

import org.raghu.springcore.beanclasses.Employee;
import org.raghu.springcore.beanclasses.EmployeeConst;
import org.raghu.springcore.beanclasses.StringList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class empclient {

	public static void main(String[] args) 
	{
	
		 ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Config.xml");
		 Employee emp1=(Employee) context.getBean("empsetter");
		 System.out.println("Employee ID:"+emp1.getId());
		 System.out.println("Employee Name:"+emp1.getName());
		 System.out.println("Employee Age:"+emp1.getAge());
		 System.out.println("Employee Address:"+emp1.getAddress());
		 EmployeeConst emp2=(EmployeeConst)context.getBean("empconst");
		 emp2.getDetails();
		 StringList str=(StringList) context.getBean("stringlist");
		 str.getL1();
		 str.getL2();
	}
}
