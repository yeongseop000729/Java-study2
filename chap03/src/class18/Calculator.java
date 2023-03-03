package class18;

/**
 * 정적 멤버(필드,메소드)
 */

public class Calculator {
	// 원주율
	static double pi = 3.14159;

	// 넓이 구하는 인스턴스 메소드(원주율*반지름*반지름)
	static double area(int radius) {
		return pi * radius * radius; // this 사용 불가
	}

}
