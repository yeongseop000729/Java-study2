package class12;

/**
 * 가변길이 parameter 메소드 연습 라이브러리 클래스/vo클래스
 */

public class Calculator {
	// 가변길이 매개변수를 갖는 메소드 선언  필드(x)
	int sum(int... values) {
		// sum 변수 선언
		int sum = 0;

		// valuse는 배열 타입의 변수처럼 사용
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		// 합산 결과를 리턴
		return sum;
	}
}
