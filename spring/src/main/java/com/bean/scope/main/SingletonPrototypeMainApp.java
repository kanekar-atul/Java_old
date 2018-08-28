package com.bean.scope.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.scope.model.A;

public class SingletonPrototypeMainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		A a = (A) context.getBean("a");
		a.setId(123);
		a.getB().setId(321);

		System.out.println(" A " + a.getId() + " B =" + a.getB().getId());

		A a1 = (A) context.getBean("a");
		System.out.println(" A " + a1.getId() + " B =" + a1.getB().getId());
	}

}
