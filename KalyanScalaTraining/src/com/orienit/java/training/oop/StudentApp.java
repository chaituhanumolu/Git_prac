package com.orienit.java.training.oop;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("kalyan");
		s1.setId(1);
		s1.setCourse("spark");
		System.out.println("Java: Student1: " + s1);

		Student s2 = new Student("venkat");
		s2.setId(2);
		s2.setCourse("spark");
		System.out.println("Java: Student2: " + s2);
		
		Student s3 = new Student("venkat", 2);
		s3.setCourse("spark");
		System.out.println("Java: Student3: " + s3);
		
		Student s4 = new Student("venkat", 3, "spark");
		System.out.println("Java: Student4: " + s4);

	}
}












