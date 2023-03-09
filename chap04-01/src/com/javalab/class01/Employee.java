package com.javalab.class01;

public class Employee {
	
	// 필드 선언
	
	private String name;
	private int age;
	private int salary;
	private String local;
	private int terms;
	private String gubun;
	
	// 기본 생성자 = 기본값 초기화
	public Employee() {
	}
	
	// 오버로딩 생성자 = 여러개 초기화
	public Employee (String name, int age, int salary, String local, int terms, String gubun) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.local = local;
		this.terms = terms;
		this.gubun = gubun;
	}

	// getter , setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
}
