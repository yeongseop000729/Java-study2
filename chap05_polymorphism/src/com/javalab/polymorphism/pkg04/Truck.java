package com.javalab.polymorphism.pkg04;

// 트럭 클래스 (자식 클래스)

public class Truck extends Vehicle {

	@Override
	public void run() {
		System.out.println("트럭이 화물을 가득 싣고 큰소리로 운행합니다.");
	}
}
