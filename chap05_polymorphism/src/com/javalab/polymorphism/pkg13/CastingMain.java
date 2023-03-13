package com.javalab.polymorphism.pkg13;

public class CastingMain {
	public static void main(String[] args) {
		// 인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();

		// 인터페이스를 통해서 호출
		vehicle.run();
		// 호출 불가(x) 오버라이딩 메소드 아님
		// 부모에게는 없는 자식에만 있는 메소드로 호출 불가
		// vehicle.checkFare();

		// 인터페이스에 없는 자식만이 갖고 있는 메소드 호출하려면 자식 타입으로 강제 형변환해야
		// 강제 타입 변환후 - 구현 클래스가 추가한 메소드를 호출하기 위한 강제 타입 변환
		Bus bus = (Bus) vehicle; // 부모 -> 자식 타입 변환
		bus.run();
		bus.checkFare(); // 구현 클래스의 승차요금 메소드 호출

	}

}
