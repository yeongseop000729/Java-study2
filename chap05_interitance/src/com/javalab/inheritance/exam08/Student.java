package com.javalab.inheritance.exam08;

public class Student extends Person {
	private String studentId; // 학번

	public Student(String name, int age, String email, String department, String studentId) {
		super(name, age, email, department);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("학번: " + this.getStudentId());
		System.out.println("학과: " + this.getDepartment());
	}
}
