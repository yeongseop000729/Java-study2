package com.javalab.polymorphism.pkg14;

// 실행 클래스

public class CarMain {

	public static void main(String[] args) {
		
		// 1. Car 객체 생성
		Car myCar = new Car();
		
		// run() 메소드 실행
		myCar.run();
		
		System.out.println();
		
		// 2. 타이어 교체
		// 타이어 교체시 오직 한국 타이어만 교체 가능[필드를 특정 타이어
		myCar.tire1 = new HankookTire();
		myCar.tire2 = new HankookTire();
		myCar.run();
		System.out.println();
		
		// 3. 타이어를 다른 회사걸로 교체 가능
		// 자동차의 필드를 Tire 인터페이스 타입으로 해놓음
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		myCar.run();
	}
}
