package com.javalab.exception.pkg02;

/**
 * 실행 예외(Runtime Exception) 처리 클래스 
 * - NullPointerException : 변수가 참조하고 있는 메모리 번지가 없는 상태에서 사용 
 * - try{..}catch(예외){...} : 예외를 처리해서 프로그램 강제 종료 방지
 */

public class NullPointerExample {

	public static void main(String[] args) {
		String data = null; // String type 클래스 변수 data 선언
		/**
		 * try{ 
		 * ..... 예외 발생 가능성이 있는 코드 
		 * }catch(예외 기술){ 
		 * ..... 예외 발생시 해결(처리) 
		 * }finally{ 
		 * ..... 정상실행, 예외발생 모두 이 부분 무조건 실행 }
		 */
		try {
			Student stu = null; // 클래스 변수 선언만 해놓음(초기화 안됨.)
			// stu = new Student(); // 빈객체 생성하면 예외 발생 안함.
			System.out.println(stu.a); // 예외발생하는 부분 (객체 생성후 초기화 안했는데 사용하려함.)
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외 발생!");
			System.out.println("적절한 조치를 시행하세요. 프로그램 종료 안됨");
		}
	}
}

class Student{
	public int a = 10;
	Student() {
	}
}
