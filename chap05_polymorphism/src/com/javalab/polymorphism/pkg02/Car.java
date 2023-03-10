package com.javalab.polymorphism.pkg02;

// Tire 객체를 멤버로 갖는 클래스

public class Car {

	// 필드 선언 (타이어 클래스 타입을 필드로 갖게됨)
	public Tire tire;

	// 메소드 선언
	public void run() {
		// tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}

}
