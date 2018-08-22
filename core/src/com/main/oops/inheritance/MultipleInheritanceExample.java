package com.main.oops.inheritance;

class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg() {
		System.out.println("Welcome");
	}
}

// To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
public class MultipleInheritanceExample { //extends A,B{

	void main(String args[]) {
		MultipleInheritanceExample obj = new MultipleInheritanceExample();
		//obj.msg(); 
	}
}