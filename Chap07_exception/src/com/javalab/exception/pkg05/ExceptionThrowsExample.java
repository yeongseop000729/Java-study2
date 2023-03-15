package com.javalab.exception.pkg05;

/**
 * 예외 떠넘기기
 * - 호출된 메소드에서는 직접 예외를 처리하거나 또는 호출한 곳으로 던져버릴 수 있다.
 * - 호출한 곳에서는 던져진 예외를 반드시 처리해야 한다.
 * 즉 두곳 중에서 한곳에서 반드시 처리해야 함. 안하면 컴파일 오류!
 */

public class ExceptionThrowsExample {

	public static void main(String[] args) {
		
		//try {
			method1("java.lang.Stringg");
		//} catch (ClassNotFoundException e) {
		//	System.out.println("클래스가 존재하지 않습니다.");
		//} finally {
		//	System.out.println("클래스가 존재합니다.");
		//}
	}
	/**
	 * 호출된 메소드에서 예외가 발생되면 직접 처리하지 않고 자신을 호출한 곳으로 던짐
	 */
	private static void method1(String cls) /* throws ClassNotFoundException */ {
		
		//Class clazz = Class.forName(cls);
		
		try {
			Class clazz = Class.forName(cls);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다. 호출받은 메소드에서 예외를 처리했습니다.");
		} finally {
			//System.out.println("클래스가 존재합니다.");
		}
	}
}
