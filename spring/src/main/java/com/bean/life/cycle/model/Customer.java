package com.bean.life.cycle.model;

public class Customer {

	private int id;

	private String name;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void init() {
		System.out.println("This is from init()");
	}

	public void destroy() {
		System.out.println("This is from destroy()");
	}
}
