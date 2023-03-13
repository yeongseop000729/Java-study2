package com.javalab.polymorphism.pkg08;

public class VehicleMain {

	public static void main(String[] args) {
		
		// 운전기사 클래스 객체 생성
		Driver driver = new Driver();
		
		// 부모 타입 배열 변수 준비 두 칸짜리
		Vehicle[] vehicles = new Vehicle[2];
 		
		// 배열에 자식 객체 저장(두 개)
		vehicles[0] = new Bus();
		vehicles[1] = new Taxi();
		
		// 반복문으로 운행시키기
		for(Vehicle vehicle : vehicles) {
			driver.drive(vehicle);
		}

	}

}
