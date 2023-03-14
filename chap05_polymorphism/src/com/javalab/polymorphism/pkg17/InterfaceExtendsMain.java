package com.javalab.polymorphism.pkg17;

//실행 클래스
public class InterfaceExtendsMain {
	
	public static void main(String[] args) {
		// 구현 객체 생성
		InterfaceCImpl impl = new InterfaceCImpl(); // 구현객체(자식객체) 생성
		
		InterfaceA ia = impl; // 구현객체(자식)를 InterfaceA Type 인터페이스에 저장
		ia.methodA(); // 저장한 인터페이스가 갖고 있는 메소드이름으로 자식 메소드가 호출됨.
		// ia.methodB(); // (x) InterfaceA는 메소드 methodA만 호출가능
		System.out.println();
		
		InterfaceB ib = impl; 
		//ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
