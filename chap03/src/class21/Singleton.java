package class21;

public class Singleton {
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();

	// private 접근 권한을 갖는 생성자 선언
	private Singleton() {
	}

	// public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getSingleton() {
		return singleton;
	}
}
