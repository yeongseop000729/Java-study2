package class21;

/**
 * 한지붕 세가족
 * - simulate()와 main()메소드는 Car클래스 안에 있지만
 *   Car클래스의 것이 아니다. 왜냐하면 정적 메소드이기 떄문이다.
 * - 정적 메소드 안에서는 Car 객체의 멤버인 speed 필드에 접근할 수 없다.
 *   this도 사용할 수 없다.
 *   접근하려면 Car객체를 생성해서 접근해야 한다.
 */

public class Car {
	// 인스턴스 필드 선언
	int speed;

	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	// 정적 (static) 메소드
	static void simulate() {
		// 객체 생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}

	// 정적 (static) 메소드
	public static void main(String[] args) {
		// 정적 메소드 호출
		simulate();

		// 객체 생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}
