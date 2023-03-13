package com.javalab.polymorphism.pkg08;

public class Taxi extends Vehicle {

	// 부모가 가진 추상 메소드 구현
	@Override
	public void run() {
		System.out.println("택시가 달립니다."); // 메소드 구현부
	}

	// 부모가 가진 추상 메소드 구현
	@Override
	public void stop() {
		System.out.println("택시가 정차합니다.");// 메소드 구현부
	}
}
