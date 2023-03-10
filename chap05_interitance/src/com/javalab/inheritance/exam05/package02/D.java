package com.javalab.inheritance.exam05.package02;

import com.javalab.inheritance.exam05.package01.A;

// 상속 관계가 있는 다른 패키지의 클래스
public class D extends A { // 부모 A를 상속함

	// 생성자 선언
	public D() {
		// A() 생성자 호출
		// super = A 부모님
		super(); // o
	}

	// 메소드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value"; // o
		// A 메소드 호출
		this.method(); // o
	}

	// 메소드 선언
	public void method2() {
		// A a = new A(); // x
		// a.field = "value"; // x
		// a.method(); // x
	}
}
