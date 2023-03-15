package com.javalab.api.pkg04;

// 자동차를 렌트해주는 대리점 클래스

public class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		return new Car();
	}

}
