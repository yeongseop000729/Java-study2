package class15;

public class Calculator {
	// 필드

	// 생성자

	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // 내부 메소드 호출
		double result = sum / 2;
		return result;
	}

	// 클래스 외부에서 호출되는 메소드
	void execute() {
		double result = avg(7, 10); // 내부 메소드 호출
		println("실행결과 : " + result); // 내부 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
