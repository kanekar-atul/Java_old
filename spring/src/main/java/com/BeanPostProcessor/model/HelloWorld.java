package com.BeanPostProcessor.model;

public class HelloWorld {
	private String message;

	public HelloWorld() {
		super();
		System.out.println(" From HelloWorld() ");
	}

	public void setMessage(String message) {
		System.out.println(" From setMessage() ");
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}
