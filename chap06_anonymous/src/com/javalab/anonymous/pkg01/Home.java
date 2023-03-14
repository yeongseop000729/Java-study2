package com.javalab.anonymous.pkg01;

public class Home {

	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {

		// 익명 구현 객체를 생성해 부모타입에 넣음
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOFF() {
			System.out.println("TV를 끕니다.");
		}
	}; // end 익명 구현 객체

	// 메소드 (필드 이용)
	// 오버라이드 할경우 부모 객체가 자식 객체한테 가려진다.
	public void use1() {
		rc.turnOn();
		rc.turnOFF();
	}

	// 메소드 (로컬 변수 이용)
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() { // new RemoteControl() = 인터페이스 이름

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOFF() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOFF();
	}

	// 메소드 (매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOFF();
	}

}
