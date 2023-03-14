package com.javalab.polymorphism.pkg17;

/**
 * 구현 클래스 (자식)
 * -InterfaceC를 구현한 구현 클래스(자식클래스)
 * -InterfaceC는 InterfaceA와 InterfaceB를 상속했음.
 * (메소드)의 시그너처는 InterCIml 클래스에 마우스를 갖다 대면 자동으로 구현해줌.
 */

public class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCIml-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCIml-methodB() 실행");	
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCIml-methodC() 실행");
	}
}
