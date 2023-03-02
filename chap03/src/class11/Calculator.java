package class11;

/**
 * 계산기 라이브러리/도메인 클래스
 */

public class Calculator {

	// 리턴값이 없는 메소드 선언(void를 붙인다)
	void powerOn() {
		System.out.println("계산기 전원을 켭니다.");
	}

	// 리턴값이 없는 메소드 선언(void를 붙인다)
	void powerOff() {
		System.out.println("계산기 전원을 끕니다.");
	}

	/**
	 * 덧셈 메소드 선언 두 정수 값을 전달받고, 
	 * 호출한 곳으로 결과값을 반환 
	 * 반환 타입은 int 이다. 왜냐하면 반환값의 자료형이 int 이기 떄문
	 */
	int plus(int x, int y) { // 매게변수
		int result = x + y;
		return result; // 값 반환(리턴)
	}

	// 나눗셈 메소드
	// 호출한 곳으로 double 타입 결과값 반환
	// 반환 타입은 double 이다. 왜냐하면 반환값의 자료형이 double 이기 떄문
	double divide(int x, int y) {
		double result = (double) x / (double) y; // 정수/정수
		return result; // 리턴값 지정;
	}
	// 곱셈 메소드
	// void 으로 직접 출력
	void multiplication(int x, int y) {
		int result = x * y;
		System.out.println("곱셈 결과는 : " + result);
	}
	// 뺄셈 메소드
	// int result를 안쓸꺼면 return x-y; 로 사용가능
	int subtraction(int x, int y) {
		int result = x - y;
		return result;
	}
}
