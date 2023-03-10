package com.javalab.inheritance.exam06;

// 자식 클래스 - 생성할 떄 이클립스 자동 생성 기능 활용
public class Child extends Parent {

	// 메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}

	// 메소드 선언
	public void method3() {
		System.out.println("Child-method3()");
	}

}
