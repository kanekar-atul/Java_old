package com.bean.life.cycle.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.life.cycle.model.Customer;

public class BeanLifeCycle {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer h = (Customer) context.getBean("cust");
		System.out.println(h.getId() + " " + h.getName());
	}

}
