package com.javalab.lambda01;

/**
 * [람다식 미사용]
 * - 람다식이 없는 일반적인 형태의 메소드 사용 방법 예제
 */

public class Lambda001 {

	public static void main(String[] args) {
		int max = 0; // 임시변수 선언과 동시에 초기화
		
		max = max(2, 3);
		System.out.println(max);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
