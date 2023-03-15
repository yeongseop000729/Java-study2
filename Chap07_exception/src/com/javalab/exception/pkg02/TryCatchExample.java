package com.javalab.exception.pkg02;

/**
 * 예외처리
 * - Class, forName : 파라미터로 주어진 클래스가 있는지 확인해서 없으면
 * ClassNotFoundException 예외를 발생시킨다.
 * - 일반 예외로서 컴파일 타임에 이클립스가 처리하라고 알려줌. 미처리시 오류
 */

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		//try {
			//Class.clazz = Class.forName("java.lang.String2");
		//	System.out.println("java.lang.String2 클래스가 존재합니다.");
		//} catch(ClassNotFoundException e) {
		//	System.out.println("클래스가 존재하지 않습니다.");
		//}
	}

}
