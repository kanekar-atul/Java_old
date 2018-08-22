package com.main.oops;

class Student8 {
	int rollno;
	String name;
	float fee;

	Student8(int rollno, String name, float fee) {
		this.rollno = rollno;  // this
		this.name = name; // this
		this.fee = fee; // this
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class ThisExampleOne {

	public static void main(String[] args) {
		Student8 s1=new Student8(111,"ankit",5000f);  
		Student8 s2=new Student8(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}

}
