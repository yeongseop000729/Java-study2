package com.javalab.inheritance.exam04;

/**
 * 실행 클래스
 */

public class ChildMain {

	public static void main(String[] args) {

		Parent p = new Parent(); // 부모 객체 생성
		Child c = new Child(); // 자식 객체 생성

		System.out.println("p.x = " + p.x); // 부모의 필드에 접근(상속했음)
		p.display1(); // 부모의 display1() 호출

		System.out.println("c.x = " + c.x);

		p.display2(); // 부모 객체의 display2 호출
		c.display2(); // 자손 객체의 display2 호출

		c.display3(); // 자손 객체의 display3 호출

		c.display1(); // 물려받았기 떄문에 호출 가능
		// p.display3(); // 부모에게는 없기 떄문에 오류

		/**
		 * 자손 객체를 부모 타입에 저장하고 있음 
		 * 자손 객체가 display2()메소드 재정의 안하면 부모 메소드 호출됨
		 */
		p = new Child(); // 자식 -> 부모로 자동 타입변환
		p.display2(); // 부모 메소드는 감춰지고 자손 메소드가 호출됨.
		
	}

}
