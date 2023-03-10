package com.javalab.inheritance.exam04;

/**
 * 부모 클래스
 */

public class Parent {

	public int x = 100; // int타입에 x를 선언 하고 100으로 초기화

	// 부모에게만 있는 메소드
	void display1() {
		System.out.println("Parent display1( )");
	}

	// 부모 자식 모두에세 있는 메소드
	void display2() {
		System.out.println("Parent display2( )");
	}

}
