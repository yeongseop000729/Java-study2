package com.javalab.inheritance.exam03.pkg01;

/**
 * 부모 클래스
 */
public class Phone { // extends Object 생략되있는거

	// 필드 선언
	public String model;
	public String color;
	
	// Object -> Phone -> SmarPhone 순서로 만들어진다
	
	
	// 기본 생성자
	public Phone() { // 생성자는 클래스 이름과 같아야한다.
		super(); // 최고 조상 Object 호출
	}

	// 생성자 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;

	}

	// phoneInfo() 메소드 구현
	public void showPhoneInfo() {
		//
		System.out.println("[ phone Info ]");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
	}

}
