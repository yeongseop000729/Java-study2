package com.javalab.anonymous.pkg02;

/**
 * Car를 사용하는 실행클래스
 */

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.run(); // snowTire
		System.out.println();

		// 전기차 타이어로 교체
		car.tire = new ElectricTire(); // 자동 타입 변환 (자식 -> 부모)
		car.run();

		// 또다른 광폭 타이어 객체를 익명 형태로 정의해서 타이어 교체함. (익명객체-재사용불가)
		car.tireBig = new Tire() {
			@Override // 익명 자식
			public void roll() {
				System.out.println("새로운 광폭 타이어가 더 힘차게 굴러갑니다.");
			}
		};
		car.run();

		System.out.println();

		// instanceof 객체의 타입 확인
		if (car.tire instanceof Tire) {
			System.out.println("car.tire는 Tire타입입니다.");
		}
		if (car.tireBig instanceof Tire) {
			System.out.println("car.tireBig도 Tire타입입니다.");
		}
	}
}
