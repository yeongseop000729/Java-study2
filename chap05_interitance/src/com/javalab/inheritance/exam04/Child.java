package com.javalab.inheritance.exam04;

/**
 * 오버라이딩 예제
 * 자식 클래스
 */
public class Child extends Parent {
	
	int x = 200;
	
	// 메소드 오버라이딩(부모의 메소드를 다시 정의함)
	@Override // 어노테이션
	// @Override 오버라이딩 한 메소드 위에 붙이기
	// @Override 있으면 오류난걸 검사 후 바로 잡아준다
	
	// @Override 생성 방법 = 마우스 오른쪽 -> Source -> Override/implement 클릭
	void display2() {
		System.out.println("Child display2( )");
	}
	
	
	// 자식이 새롭게 추가한 메소드
	void display3() {
		System.out.println("Child display3( )");
	}

}
