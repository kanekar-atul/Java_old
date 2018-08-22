package com.main.oops;

class Student6 {
	int id;
	String name;

	// constructor to initialize integer and string
	Student6(int i, String n) {
		id = i;
		name = n;
	}

	// constructor to initialize another object
	Student6(Student6 s) {
		id = s.id;
		name = s.name;
	}
	Student6() { }

	void display() {
		System.out.println(id + " " + name);
	}

}

public class CopyConstructor {
	public static void main(String args[]) {
		Student6 s1 = new Student6(111, "Karan");
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();

		System.out.println("Copying values without constructor \n");

		Student6 s3 = new Student6(112, "Amit");
		Student6 s4 = new Student6();
		s4.id = s3.id;
		s4.name = s3.name;
		s3.display();
		s4.display();

	}
}
