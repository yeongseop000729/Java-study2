package com.javalab.polymorphism.pkg17;

/**
 * 다중 상속 인터페이스
 * - 인터페이스가 다른 인터페이스를 동시에 여러개 상속 받는 구조
 */

public interface InterfaceC extends InterfaceA, InterfaceB {
	// 상속 받은 메소드가 들어와 있음. methodA(), methodB()
	// 추상 메소드
	void methodC();

}
