package com.javalab.polymorphism.pkg16;

/**
 * 드라이버 클래스
 * 인터페이스를 통한 매개 변수의 당형성 구현을 위한 객체
 * 개발 코드와 인터페이스 구현 객체들 사이에서 재정의된 메소드를 대신 호출해주는 역할
 */

public class Driver {
	
	// 운행 메소드 (파라미터가 Vehicle 인터페이스 타입)
	void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
