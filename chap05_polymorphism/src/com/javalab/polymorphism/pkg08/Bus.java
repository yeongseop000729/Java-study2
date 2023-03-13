package com.javalab.polymorphism.pkg08;

public class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// 주석처리하면 클래스가 추상 클래스가 되어야 함.
	@Override
	public void stop() {
		System.out.println("버스가 정차합니다.");
	}

}