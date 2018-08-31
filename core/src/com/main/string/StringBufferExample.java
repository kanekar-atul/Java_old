package com.main.string;

public class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		System.out.println("\n");

		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello

		System.out.println("\n");

		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.replace(1, 3, "Java");
		System.out.println(sb2);// prints HJavalo

		System.out.println("\n");

		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.delete(1, 3);
		System.out.println(sb3);// prints Hlo

		System.out.println("\n");

		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.reverse();
		System.out.println(sb4);// prints olleH

	}
}
