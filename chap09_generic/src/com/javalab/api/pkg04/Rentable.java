package com.javalab.api.pkg04;

/**
 * 제네릭 인터페이스
 * 
 * @param <P> 타입 파라미터로 상품을 전달 받는다.
 */

public interface Rentable<P> {
	// public abstract 생략되있다.
	P rent(); // 추상메소드 : 구현클래스(자식)에서 반드시 오버라이딩!

}
