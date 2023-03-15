package com.javalab.api.pkg06;

public class BoxingUnBoxingExample2 {
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100); // int 값을 받는 생성자
		Integer obj2 = new Integer("200"); // 문자열을 받는 생성자
		
		// 문자열 형식의 int 값을 받아서 Integer 타입 객체로 반환함.
		Integer obj3 = Integer.valueOf("300");

		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		// double 타입 기본값과 Double 타입 객체간의 변환
		Double dobj1 = 3.141592; // 박싱 (double 타입 기본값이 객체로 변환)
		System.out.println(dobj1.doubleValue());
		System.out.println(dobj1);
	}
}
