package com.main.oops;

class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n"); 
		this.m();
	}
}

public class ThisInvokeCurrentClassMethod {
	public static void main(String args[]) {
		A a = new A();
		a.n();
	}
}
