package com.javalab.anonymous.pkg00;

// Tire 객체를 멤버로 갖는 클래스
public class Car {

	// 필드 선언(타이어 클래스 타입을 필드로 갖게됨)
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { // <- 상속 관계 구현

		// 오버라이드 하려면 상속 관계부터 생성해야 한다.
		// 익명 자식 객체
		// 오버라이드를 하면 새로운 자식이 태어난다.
		@Override
		public void roll() {
			System.out.println("익명 자식 타이어 객체1이 굴러갑니다.");
		}
	}; // ; 이 반드시 들어가야 함.

	// 메소드 선언
	public void run1() {
		tire1.roll();
		tire2.roll(); // 자식 오버라이드된 메소드 호출
	}

	// 메소드 내에서 익명 구현 객체 생성
	public void run2() {
		Tire tire = new Tire() { // Tire tire (로컬변수) 로 통해 자식을 만들었다.
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러갑니다.");
			}
		};
		tire.roll();
	}

	// 다형성 구현 (매개변수의 다형성)
	public void run3(Tire tire) {
		tire.roll();
	}
}
