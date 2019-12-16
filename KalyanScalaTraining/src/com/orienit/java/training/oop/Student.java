package com.orienit.java.training.oop;

public class Student {
	String name;
	int id;
	String course;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int id) {
		new Student(name);
		this.id = id;
	}

	public Student(String name, int id, String course) {
		new Student(name, id);
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
