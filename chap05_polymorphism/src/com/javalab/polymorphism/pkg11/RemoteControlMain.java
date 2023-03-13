package com.javalab.polymorphism.pkg11;

public class RemoteControlMain {
	public static void main(String[] args) {

		// 인터페이스 변수 선언
		// 인터페이스 타입 변수 rc;
		RemoteControl rc;

		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television(); // Television 객체 초기화
		rc.turnOn(); // TV 켬
		rc.setVolume(11);
		rc.turnOff(); // TV 끔
		System.out.println();

		// Audio 객체를 생성하고 인터페이스 변수에 대입
		// 오버라이드 한 자식 메소드가 호출된다.
		rc = new Audio();
		rc.turnOn(); // TV 켬
		rc.setVolume(-1);
		rc.turnOff(); // TV 끔
		System.out.println();

		RemoteControl[] remoteControls = new RemoteControl[2];
		remoteControls[0] = new Television();
		remoteControls[1] = new Audio();

		// 향상된 for문
		for (int i = 0; i < remoteControls.length; i++) {
			remoteControls[i].turnOn();
			remoteControls[i].turnOff();

		}
		System.out.println();

		// 일반 for문
		for (RemoteControl remoteControl : remoteControls) {
			remoteControl.turnOn();
			remoteControl.turnOff();
		}
	}
}
