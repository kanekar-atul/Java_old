package com.BeanPostProcessor.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.BeanPostProcessor.model.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorldBeanPostPro");
		obj.getMessage();
		context.registerShutdownHook();
	}
}