package com.javalab.inheritance.exam08;

public class Professor extends Person {
	private String professorId;

	public Professor(String name, int age, String email, String department, String professorId) {
		super(name, age, email, department);
		this.professorId = professorId;
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("교수ID: " + professorId);
		System.out.println("학과: " + getDepartment());

	}
}
