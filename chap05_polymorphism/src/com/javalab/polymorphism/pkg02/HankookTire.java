package com.javalab.polymorphism.pkg02;

// 자식 클래스 (한국타이어)

public class HankookTire extends Tire {

	// 메소드 재정의(오버라이딩)
	// 오버라이딩 = 다형성 구현
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}

}
