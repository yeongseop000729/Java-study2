package com.javalab.collection.pkg10;

public class Student {
	public String studentId;
	public String jumin;
	public String name;
	public int year;
	public String juso;
	public int department;

	public Student() {
		super();
	}

	public Student(String studentId, String jumin, String name, int year, String juso, int department) {
		super();
		this.studentId = studentId;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.juso = juso;
		this.department = department;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getJuso() {
		return juso;
	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", jumin=" + jumin + ", name=" + name + ", year=" + year + ", juso="
				+ juso + ", department=" + department + "]";
	}

}
