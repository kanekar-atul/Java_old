package com.main.oops.polymorphism;

public class MethodOverloadingWithTypePromotionWithAmbiguity {

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		MethodOverloadingWithTypePromotionWithAmbiguity obj = new MethodOverloadingWithTypePromotionWithAmbiguity();
	//	obj.sum(20, 20);// now ambiguity
	}

}
