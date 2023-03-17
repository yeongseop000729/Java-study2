package com.javalab.collection.pkg07;

public class Student {
	private Integer studentId;
	private String name;
	private Integer score;

	public Student() {
		super();
	}

	public Student(Integer studentId, String name, Integer score) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", score=" + score + "]";
	}

}