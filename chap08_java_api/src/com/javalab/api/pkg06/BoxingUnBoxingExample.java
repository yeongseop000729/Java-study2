package com.javalab.api.pkg06;

/**
 * 박싱과 언박싱
 */

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing(int 타입 -> Integer 타입 객체로 변신)
		Integer obj = 100;
		
		// 객체 내부의 int값 반환
		System.out.println("value: " + obj.intValue()); // 객체 내부의 int값
		
		// Unboxing(Integer type 객체의 값을 꺼내서 int 타입 변수에 저장)
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산시 Unboxing
		int result = obj + 100; // obj는 언박싱후 100과 더해짐
		System.out.println("result: " + result);
	}

}
