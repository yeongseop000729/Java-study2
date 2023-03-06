package class26.exam05;

/**
 * [ 메소드 오버로딩 ]
 * 계산기 라이브러리 클래스
 * 동일한 이름의 메소드를 매개변수의 타입, 갯수, 순서를 달리하여 정의함
 * 매게변수의 형태에 따라서 알맞은 메소드가 자동으로 호출된다.
 */

public class Calcu01 {
	
	// 정수 덧셈 메소드
	public int sum(int x, int y) {
		return x + y;
	}
	
	// 실수 덧셈 메소드
	public double sum(double x, double y) {
		return x + y;
	}

}
