package com.javalab.api.pkg04;

// 집을 렌트해주는 대리점 클래스

public class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() {
		return new Home();
	}

}
