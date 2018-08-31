package com.main.string;

public class ExampleTwo {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";

		if (s1.equals(s2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (s1 == s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println("\n");

		String s3 = new String("Java");
		String s4 = new String("Java");

		if (s3.equals(s4)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (s3 == s4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		s3 = s3.intern();
		s4 = s4.intern();

		if (s3 == s4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
	}

}
