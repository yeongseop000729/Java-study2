package com.javalab.polymorphism.pkg13;

/**
 * 운송수단 인터페이스를 구현한 구현 클래스
 */
public class Bus implements Vehicle {

	// 부모 인터페이스가 갖고 있는 추상 메소드 재정의(오버라이딩)
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// 승자 요금 확인 메소드(추가 메소드)
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
