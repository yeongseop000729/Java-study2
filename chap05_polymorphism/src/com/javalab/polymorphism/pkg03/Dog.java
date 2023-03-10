package com.javalab.polymorphism.pkg03;

// 개 클래스 (자식 클래스)

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
}
