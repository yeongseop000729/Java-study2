package com.javalab.generic.pkg05;

/**
 * 제네릭 메소드를 사용하는 실행클래스
 */

public class GenericExample {
	
	/**
	 * 제네릭 메소드 boxing()
	 * - 맨앞의 <T> : 타입 파라미터 // 2번
	 * - Box<T> : 반환타입 // 3번
	 * - boxing(T t) : 메소드명(파라미터) // 1번
	 * 순서
	 * - boxing(T t) -> 맨앞의 <T> -> Box<T>
	 */
	
	// 제네릭 메소드 boxing()
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		// Box<String> box = new Box<>();
		box.set(t);
		return box; // 제네릭 객체 (Integer객체를 갖고 있는)
	}
	
	// main 메소드
	public static void main(String[] args) {
		
		Box<Integer> box1 = boxing(100); // 제네릭 메소드
		int intValue = box1.get();
		System.out.println(intValue);
		
		// 제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동"); // 제네릭
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
