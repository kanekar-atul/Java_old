package com.applicationcontext.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld h = (HelloWorld) context.getBean("helloworld2");
		h.getMessage();
	}
}
