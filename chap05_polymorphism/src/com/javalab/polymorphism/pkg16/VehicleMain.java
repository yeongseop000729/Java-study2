package com.javalab.polymorphism.pkg16;

public class VehicleMain {

	public static void main(String[] args) {

		// 문제.1 다형성이 아닌 일반적인 객체활용
		System.out.println("[1] 다형성이 아닌 일반적인 객체활용=============");

		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		taxi.run();
		bus.run();
		System.out.println();

		// 문제.2 인터페이스와 매개 변수를 활용한 다형성 구현
		System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현==============");
		Driver driver = new Driver();
		driver.drive(taxi); // Driver객체의 drive()메소드로 전달되면서 자동 타입 변환
		driver.drive(bus);
		System.out.println();

		// 문제.3 반복문을 통해서 운행을 자동화 시킴
		System.out.println("[3] 반복문을 통해서 운행을 자동화 시킴=================");
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Bus(); // 자동 타입 변환
		vehicles[1] = new Taxi(); // 자동 타입 변환

		for (int i = 0; i < vehicles.length; i++) {
			driver.drive(vehicles[i]);
		}
	}
}