package class14;

/**
 * 메소드 오버로딩 연습 라이브러리 클래스
 */

public class PlusCalculator {
	
	// 메소드 오버로딩이란? = 타-개-순 3가지중 하나라도 틀려야된다.

	// 정수 덧셈 메소드
	// int 타입 2개
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴값 지정;
	}

	// 실수 메소드
	// double 타입 2개
	double plus(double x, double y) {
		double result = x + y;
		return result; // 리턴값 지정;
	}
}
