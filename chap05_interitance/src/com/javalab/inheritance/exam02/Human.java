package com.javalab.inheritance.exam02;

/**
 * 부모 클래스
 */
public class Human {
	// 필드
	String name;
	int age;

	// 생성자
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 객체의 정보를 보여주는 메소드
	public void humanInfo() {
		System.out.println("[Human Info]");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);

	}

}
