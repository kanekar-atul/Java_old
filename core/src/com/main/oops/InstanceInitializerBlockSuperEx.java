package com.main.oops;

class A2 {
	
	{
		System.out.println("From A2 : instance initializer block is invoked");
	}
	
	A2() {
		System.out.println("parent class constructor invoked");
	}
}

public class InstanceInitializerBlockSuperEx extends A2 {
	InstanceInitializerBlockSuperEx() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		InstanceInitializerBlockSuperEx b = new InstanceInitializerBlockSuperEx();
	}
}