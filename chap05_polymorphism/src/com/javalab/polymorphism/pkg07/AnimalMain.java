package com.javalab.polymorphism.pkg07;

public class AnimalMain {

	public static void main(String[] args) {

		// [문제.1] 객체를 생성해서 자신의 타입에 저장(다형성 아님)
		System.out.println("[1.자손 객체를 생성해서 자손 타입 변수에 저장(다형성 아님)]");

		// [문제.1-2] 자손 객체를 생성해서 자손 타입에 저장
		Dog dog = new Dog();
		Cat cat = new Cat();

		// [문제.1-3] 자손이 갖고 있는 메소드 호출해서 동물 소리내기
		dog.sound();
		cat.sound();
		System.out.println();

		// 다형성 적용, 변수의 자동 타입 변환
		// [문제.2] 객체를 생성해서 부모타입에 저장
		System.out.println("[2.다형성 적용, 자동 타입 변환 + 오버라이딩 메소드 호출]");

		// [문제.2-1]부모 타입 변수 선언
		Animal animal = null; // 추상클래스 객체 안됨.

		// [문제.2-2] 자손 객체(구현클래스)를 생성해서 부모 타입에 저장
		animal = new Dog(); // 자동 타입 변환
		animal.sound(); // 오버라이딩 메소드 호출

		animal = new Cat(); // 자동 타입 변환
		animal.sound(); // 오버라이딩 메소드 호출
		System.out.println();

		// [문제.3] 매개변수의 다형성
		System.out.println("[3.다형성 적용 매개 변수의 다형성 + 자동 타입 변환]");
		animalSound(dog);
		animalSound(animal); // animal에는 Cat객체의 주소 있음.
		System.out.println();

		Animal[] animals = new Animal[2];
		animals[0] = new Dog(); // 자동 형변환 or 자동 타입 변환
		animals[1] = new Cat(); // 자동 형변환 or 자동 타입 변환
		for (Animal animal1 : animals) {
			animalSound(animal1);

		}
	}

	private static void animalSound(Animal animal) {
		animal.sound(); // 오버라이딩 메소드 호출

	}

}
