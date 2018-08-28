package com.bean.scope.model;

public class A {
	
	private int id;
	private B b;

	public A() {
		super(); 
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
}
