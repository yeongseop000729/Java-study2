package com.javalab.polymorphism.pkg04;

// 택시 클래스 (자식 클래스)

public class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 손님을 싣고 목적지까지 달립니다.");
	}
}
