package com.main.oops;

class Student {
	int id;
	String name;

	void insertRecord(int r, String n) {
		id = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(id + " " + name);
	}
}

public class ExampleOne {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);

		System.out.println("\n Initialization through reference \n");
		
		
		Student s2 = new Student();
		s2.id = 101;
		s2.name = "Sonoo";
		System.out.println(s2.id + " " + s2.name);// printing members with a white space

		System.out.println("\n Initialization through method \n");

		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();

	}

}
