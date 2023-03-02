package class12;

/**
 * 가변길이 메소드 연습 실행클래스
 */

public class CalculatorMain {

	public static void main(String[] args) {

		// Computer 객체 생성
		// myCom = 클래스 변수
		// Calculator = 생성자 (초기화)
		Calculator myCom = new Calculator();

		// 메소드에 다수의 인자값 전달
		int result1 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("다수의 숫자 덧셈 결과 : " + result1);

		// 메소드 배열 전달
		int[] values = { 1, 2, 3, 4, 5 };
		int result2 = myCom.sum(values);
		System.out.println("배열값 덧셈 결과 : " + result2);

	}

}
