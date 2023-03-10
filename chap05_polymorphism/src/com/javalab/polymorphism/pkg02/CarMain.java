package com.javalab.polymorphism.pkg02;

// 실행 클래스

public class CarMain {

	public static void main(String[] args) {
		
		// Car 객체 생성
		Car myCar = new Car();
		
		// Tire 객체 생성
		myCar.tire = new Tire(); // 아무런 타이어가 장착되지 않은 상태
		myCar.run();
		
		// HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
