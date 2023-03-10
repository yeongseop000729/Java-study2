package com.javalab.polymorphism.pkg04;

/*
 * 운전을 해주는 클래스
 */

public class Driver {
	// 운전 메소드 선언(파라미터를 부모 타입으로 받고 있음. 자동형변환)
	public void drive(Vehicle vehicle) {
		vehicle.run(); // 부모타입이지만 오버로딩 라이딩 (@Override) 떄문에 자식에 메소드가 호출된다
	}

}
