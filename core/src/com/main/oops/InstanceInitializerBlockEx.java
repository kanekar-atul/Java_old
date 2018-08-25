package com.main.oops;

public class InstanceInitializerBlockEx {
	int speed;

	InstanceInitializerBlockEx() {
		System.out.println("...2..");
		System.out.println("speed is " + speed);
	}

	{
		System.out.println("...1..");
		speed = 100;
	}

	public static void main(String args[]) {
		InstanceInitializerBlockEx b1 = new InstanceInitializerBlockEx();
		//InstanceInitializerBlockEx b2 = new InstanceInitializerBlockEx();
	}
}
