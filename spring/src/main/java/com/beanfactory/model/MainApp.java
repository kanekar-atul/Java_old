package com.beanfactory.model;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));

		HelloWorld h = (HelloWorld) factory.getBean("helloworld");
		h.getMessage();
	}
}
