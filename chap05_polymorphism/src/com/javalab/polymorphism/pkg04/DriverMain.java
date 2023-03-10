package com.javalab.polymorphism.pkg04;

public class DriverMain {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();

		// 매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);

		// 매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);

		// 매개값으로 Truck 객체를 제공하고 driver() 메소드 호출
		Truck truck = new Truck();
		driver.drive(truck);

	}

}
