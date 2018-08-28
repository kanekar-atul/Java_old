package com.autowired.annotation.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditorAutowired");

	      te.spellCheck();
	   }
	}