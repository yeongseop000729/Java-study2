package com.javalab.class01;

/**
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 * - 콜바이 레퍼런스(Call By Reference) : 참조 주소값 복사
 */

public class CallByReference {

	public static void main(String[] args) {
		// 1)
		int[] numbers = { 1, 2, 3, 4, 5 };
		
		// int 자료형 변수 5개 선언해서 1,2,3,4,5 저장
		// 2)
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		printArray(numbers); // 배열 출력 메소드 호출
		
		printArray(a, b, c, d, e);
		
	}
	// 타입이랑 갯수 순서가 달라서 printArray로 같은 이름으로 사용가능
	// printArray를 사용할수있다 메소드 오버로딩으로 인해서 사용가능 
	
	// 2)
	                                // int a = 파라미터 매개 변수
	private static void printArray(int a, int b, int c, int d, int e) {
		// int a = 0; = 파라미터 매개 변수
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}
	// 1)
	// 배열을 전달 받아서 출력해주는 메소드
	
	public static void printArray(int[] arr) { // 참조 자료형 = 주소 메모리 번지수
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	}
}
