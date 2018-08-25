package com.main.oops;

class Animal2 {
	Animal2() {
		System.out.println("Animal2 is created");
	}
}

class Dog2 extends Animal2 {
	Dog2() {
		super();
		System.out.println("Dog22 is created");
	}
}

public class SuperExampleThree {

	public static void main(String args[]) {
		Dog2 d = new Dog2();
	}
}
