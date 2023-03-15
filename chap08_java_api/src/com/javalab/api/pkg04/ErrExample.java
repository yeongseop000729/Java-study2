package com.javalab.api.pkg04;

/**
 * System 클래스의 필드인 err을 이용하여 운영체제 영역인 콘솔창에 출력
 * - err : PrintStream 클래스
 * - println() : PrintStream 클래스의 메소드
 */

public class ErrExample {

	public static void main(String[] args) {
	
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			System.err.println("[에러 내용]"); // System 클래스의 필드인 err
			System.err.println(e.getMessage());
		}
	}
}
