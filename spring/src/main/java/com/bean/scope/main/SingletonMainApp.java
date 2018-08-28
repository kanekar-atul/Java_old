package com.bean.scope.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.applicationcontext.model.HelloWorld;
import com.bean.scope.model.EmployeeSingleton;

public class SingletonMainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeSingleton h = (EmployeeSingleton) context.getBean("empsingleton"); 
		h.setId(1); h.setName("John");
		System.out.println(h.getId() + " " + h.getName()); 
		
		EmployeeSingleton h1 = (EmployeeSingleton) context.getBean("empsingleton"); 
		System.out.println(h1.getId() + " " + h1.getName()); 
		
	}

}
