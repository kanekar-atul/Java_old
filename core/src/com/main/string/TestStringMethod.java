package com.main.string;

public class TestStringMethod {

	public static void main(String[] args) {

		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)

		System.out.println("\n");
		
		String s1 = "  Sachin  ";
		System.out.println(s1);// Sachin
		System.out.println(s1.trim());// Sachin
		
		System.out.println("\n");

		String s2 = "Sachin";
		System.out.println(s2.startsWith("Sa"));// true
		System.out.println(s2.endsWith("n"));// true
 
		System.out.println("\n");
		String s3="Sachin";  
		System.out.println(s3.charAt(0));//S  
		System.out.println(s3.charAt(3));//h  
		
		System.out.println("\n");
		
		String s4="Sachin";  
		System.out.println(s4.toUpperCase());//SACHIN  
		System.out.println(s4.toLowerCase());//sachin  
		System.out.println(s4);//Sachin(no change in original)  
		
		System.out.println("\n");
		
		String s5="  Sachin  ";  
		System.out.println(s5);//  Sachin    
		System.out.println(s5.trim());//Sachin 
		
		System.out.println("\n");

		
		String s6=new String("Sachin");  
		String s7=s.intern();  
		System.out.println(s7);//Sachin  
		
		System.out.println("\n");
		
		String s8="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s8.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);  
		
		
	}

}
