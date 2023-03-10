package com.javalab.inheritance.exam01;

// // public class 클래스명 extends 상위클래스(부모클래스)
public class Child extends Parent {

	public String address;
	public String phone;

	// * super(); 항상 첫줄에 있어야 한다 *

	// 기본 생성자
	public Child() { // super를 뺴도 child 기본생성자를 넣어준다
		super(); // 첫줄에서 부모 객체 기본 생성자 호출
	}

	public Child(String address) {
		super("김길동", 29); // 부모 필드 초기화
		this.address = address; // 자기 필드 초기화
		System.out.println("자식 객체의 생성자");
	}

	public Child(String address, String phone) {
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자1");
	}
}
