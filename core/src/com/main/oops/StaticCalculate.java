package com.main.oops;

public class StaticCalculate {

	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String args[]) {
		int result = StaticCalculate.cube(5);
		System.out.println(result);
	}

}
