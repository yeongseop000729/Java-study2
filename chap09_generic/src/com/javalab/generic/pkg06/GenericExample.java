package com.javalab.generic.pkg06;

/**
 * 제한된 타입 파라미터를 갖는 제네릭 메소드
 * - <T extends Number> : 파라미터로 전달되는 타입의 조건을 규정
 * 	   파라미터로는 Number 클래스를 상속받는 타입만 올수 있음
 */

public class GenericExample {
	
	// 제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		// T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		// Number의 메소드 사용
		// Number 클래스에 정의되어 있는 메소드로 숫자를 int타입으로 변환
		int v1 = t1.intValue();
		int v2 = t2.intValue();
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		
		// 제네릭 메소드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();
		
		// 제네릭 메소드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
	}

}
