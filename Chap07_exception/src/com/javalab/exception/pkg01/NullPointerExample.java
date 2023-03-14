package com.javalab.exception.pkg01;

/**
 * 실행 예외(Runtime Exception) 테스트 클래스 
 * - NullPointerException : 변수가 참조하고 있는 메모리 번지가없는 상태에서 사용
 */

public class NullPointerExample {

	public static void main(String[] args) {
		String data = null; // String type (참조변수) 클래스 변수 data 선언

		// 메모리 공간이 없는 상태에서 내용을 조회함(예외)
		// System.out.println(data.toString()); // (x)

		Student stu = null; // 클래스 변수 선언만 해놓음(메모리 공간 없음)
		stu = new Student(); // 빈객체 생성(필드들은 기본값으로 세팅됨)
		System.out.println(stu.a); // 예외(NullPointerException)
	}
}

class Student {
	public int a = 10;

	Student() {

	}
}
