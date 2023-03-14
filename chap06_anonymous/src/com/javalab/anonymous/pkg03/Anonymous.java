package com.javalab.anonymous.pkg03;

/*
 * 익명 객체를 필드와 메소드에서 사용하는 클래스
 */

public class Anonymous {

	// 필드 : 익명 자식 객체 생성해서 저장함
	public Person person = new Person() {

		// 자식이 추가한 메소드
		public void walk() {
			System.out.println("산책합니다.");
		}

		// 이클립스 자동생서 기능으로 구현할것.
		@Override
		public void wake() {
			System.out.println("6시에 조금 일찍 일어납니다.");
			walk();
		}
	};

	// 메소드의 지역변수에 익명 객체 생성해서 저장해놓음.
	public void method1() {
		// Person 타입의 지역변수 localVar에 익명 객체 생성해서 저장
		Person localVar = new Person() { // <- 익명 자식 객체 생성

			// 자식이 추가한 메소드
			public void work() {
				System.out.println("출근합니다.");
			}

			// 부모 메소드 오버라이딩
			@Override
			public void wake() {
				System.out.println("7시 정각에 일어납니다.");
				work(); // work() 메소드 호출;
			}
		}; // 익명 객체 정의 끝

		// 바로위에서 정의한 익명 객체의 wake()메소드 호출
		localVar.wake(); // 자식이 오버라이딩한 메소드 호출된다.
		// localVar.work(); // 부모에 없는 메소드

	} // end method1()

	// 파라미터로 익명 객체를 전달 받고 있음. (매개변수의 다형성 적용)
	public void method2(Person person) {
		person.wake(); // 전달받은 익명 객체의 wake()메소드 호출
	}
}
