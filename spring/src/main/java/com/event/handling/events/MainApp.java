package com.event.handling.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.event.handling.model.HelloWorld;

public class MainApp {
	 public static void main(String[] args) {
	      ConfigurableApplicationContext context = 
	         new ClassPathXmlApplicationContext("spring.xml");

	      // Let us raise a start event.
	      context.start();
		  
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorldEvent");
	      obj.getMessage();

	      // Let us raise a stop event.
	      context.stop();
	   }
}
