package com.javalab.stream06;
/**
 * 도메인 클래스, vo(Value Object) 클래스
 */

public class Member {
	// 정적변수, 클래스변수 (field) <--> 인스턴스변수
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public static int getMALE() {
		return MALE;
	}

	public static void setMALE(int mALE) {
		MALE = mALE;
	}

	public static int getFEMALE() {
		return FEMALE;
	}

	public static void setFEMALE(int fEMALE) {
		FEMALE = fEMALE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
	

}
