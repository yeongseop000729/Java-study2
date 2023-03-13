package com.javalab.polymorphism.pkg10;

public class RemoteControlMain {

	public static void main(String[] args) {

		// 1. 인터페이스를 사용하지 않는 평범한 경우
		Television tv = new Television();
		// tv.turnOn(); = 이제 사용하지 않음

		// 2. 인터페이스를 사용하는 경우
		// 인터페이스는 객체를 생성할수 없다
		RemoteControl rc = null; // 인터페이스 타입 변수 rc 선언

		// rc 변수에 Television 객체를 대입(일종의 자동 타입 변환)
		rc = new Television();
		rc.turnOn(); // 부모 타입의 turnOn()메소드는 감춰지고 구현 객체(자식)의 메소드가 호출됨.

		// rc 변수 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn(); // Audio 객체의 오버로딩된 메소드가 호출됨
		System.out.println();

		RemoteControl[] remoteControls = new RemoteControl[2];
		remoteControls[0] = new Television(); // 자동 타입 변환
		remoteControls[1] = new Audio(); // 자동 타입 변환
		for (int i = 0; i < remoteControls.length; i++) {
			remoteControls[i].turnOn();

		}
	}

}
