package com.javalab.polymorphism.pkg04;

// 버스 클래스 (자식 클래스)

public class Bus extends Vehicle {

	// 메소드 재정의(오버라이딩)
	@Override
	public void run() {
		System.out.println("버스가 정거장마다 멈추면서 손님을 싣고 달립니다.");
	}
}
