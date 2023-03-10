package com.javalab.inheritance.exam03.pkg01;

/**
 * 자식 클래스
 */

public class SmartPhone extends Phone {
	
	// 필드 선언
	public String frequency;
	
	public SmartPhone() {
		super(); // 부모 기본생성자 호출
	}
	
	// 생성자 구현
	// 오버로딩 생성자 
	public SmartPhone(String mondel, String color) {
		super(mondel, color);
	}

	public SmartPhone(String model, String color, String frequency) {
		
		// 부모 객체 생성자 호출
		super(model, color);
		this.frequency = frequency;
	}
	
	// 자식 생성자 선언 안함
	public void showSmartPhoneinfo() {
		this.showPhoneInfo(); // 부모의 정보를 조회하는 메소드 호출 ( this 사용 )
		System.out.println(this.frequency); // 자신의 필드 정보 조회
	}
}
