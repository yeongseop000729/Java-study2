package class26.exam06;

/**
 * 실행 클래스
 */

public class TimeMain {

	public static void main(String[] args) {

		// Time 객체 생성
		Time t = new Time();
		t.hour = 24; // 잘못된 값 입력
		t.minute = 59;
		t.second = 30;
		t.showTime();
	}
}
