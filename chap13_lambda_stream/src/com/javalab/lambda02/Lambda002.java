package com.javalab.lambda02;

/**
 *  [람다식과 인터페이스형 함수]
 *  - 람다식 : 함수(메서드)를 간단한 '식(Expression)'으로 표현하는 방법
 *  - 람다 함수는 익명 구현 객체이다. 객체이기 떄문에 저장해서 사용할 변수가 필요함.
 *  - 익명 구현 객체를 저장하기 위해서 인터페이스형 함수가 필요하다.
 */
/**
 *  [함수형 인터페이스]
 *  - 람다함수를 사용하는 쪽에서 익명 구현 객체를 선언하여 저장할 참조 변수 역함
 */
@FunctionalInterface // 어노테이션(메타데이터: 인터페이스 정보 저장 공간)
interface MyfunctionalInterface{
	public int max(int a, int b); // 추상메소드
}

// 클래스
public class Lambda002 {
	public static void main(String[] args) {
		int max = 0;
		
		MyfunctionalInterface fi; // 함수형 인터페이스 타입 변수
		
		// 익명 구현 클래스 정의와 동시에 객체 생성
		fi = new MyfunctionalInterface() {
			@Override // 부모 인터페이스가 갖고 있는 max() 오버라이딩
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		int result = fi.max(2, 3);
		System.out.println("result :" + result);
		System.out.println(fi);
		System.out.println();
		/*
		 * [람다함수 - 익명 구현 객체]
		 * - 람다 함수를 정의하면 실행시 해당 코드가 실행됨과 동시에 바로 익명 객체로 생성됨.
		 * - 즉석에서 클래스를 정의하고 바로 객체로 생성하여 사용함.
		 * - 익명 객체의 함수 내용이 재사용할 필요가 없을 경우에 주로 사용됨.
		 * [함수형 인터페이스]
		 * - 생성된 익명 객체를 어딘가에 저장해서 사용해야 함.
		 * - 바로 그 떄 필요한 것이 함수형 인터페이스임.
		 * - 람다함수 즉, 익명 구현 객체의 매개변수와 반환형을 검증.
		 	(유추해서 알수 있음)
		 */
		
		// 익명 함수를 구현하는 익명 객체를 함수형 인터페이스 타입 변수에 저장함.
		// return 키워드를 사용하는 경우 or 사용 안하는 경우[동일한 결과]
		fi = (a, b) -> {return a > b ? a : b;}; // 익명 구현 객체 태어남
		// fi = (a, b) -> a > b ? a : b; // [동일 결과]
		
		// 위의 람다 함수는 다음과 같은 의미임. 단, 사용불가함.
		// Object 클래스에는 max() 메소드가 없어서 호출 불가하기 떄문.
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		// obj.max(2, 3); // Object 클래스에는 max()메소드 없어서 호출 불가.
		max = fi.max(2, 3);
		System.out.println("람다식으로 선언한 익명 구현 객체(fi)의 max() 호출 : "              + max);
		System.out.println(fi);
		System.out.println(fi);
	
	}

}
