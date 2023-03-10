package com.javalab.inheritance.exam06;

// 실행클래스
public class ChildMain {

	public static void main(String[] args) {
		// 자식 객체 생성
		// int 제외 다른건 다 레퍼런스
		// child 타입은 Child
		Child child = new Child();

		// 부모 타입으로 자동 타입 변환
		// parent 타입은 Parent  
		Parent parent = child;
		
		// 다형성 = 상속관계에서 

		// 메소드 호출
		parent.method1();
		parent.method2(); // 부모, 자식 동시에 존재 -> 자식꺼 호출 (자식이 오버라이딩 해서 부모꺼는 감춰졌다)
		// parent.method3(); (호출 불가능)

	}

}
