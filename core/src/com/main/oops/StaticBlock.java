package com.main.oops;

public class StaticBlock {
	static {
		System.out.println("static block is invoked");
	//	System.exit(0);    // Main will not execute.
	}

	public static void main(String args[]) {
		System.out.println("Hello main");
	}
}
