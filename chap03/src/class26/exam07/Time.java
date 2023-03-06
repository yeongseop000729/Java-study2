package class26.exam07;

/**
 * 클래스
 * - 모든 필드를 외부에서 접근이 불가능하도록 private으로 처리
 * - 모든 필드를 public 메소드를 통해서 저장/조회 한다.
 */

public class Time {

	// 필드
	private int hour;
	private int minute;
	private int second;
	
	// 시간값 세팅 메소드 (setter 메소드)
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("시간 값이 올바르지 않습니다.");
			return;
		}
		this.hour = hour;
	}

	public void showTime() {
		System.out.println("현재 시간은 : " + this.hour + "시입니다.");
	}
	
}
