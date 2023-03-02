package class03;

/**
 * 실행 클래스 
 * - 객체 생성과 필드의 사용(필드에 값 저장) 
 * - 필드의 자료형이 가지는 기본 값으로 자동 초기화 된다.(생성한 객체)
 */

public class CarMain {

	public static void main(String[] args) {

		// Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출
		// Car(클래스) myCar(참조변수) = new(생성자함수) Car(클래스)();

		// 필드의 초기값 읽기
		System.out.println("모델명(String) : " + myCar.model);    // String = null
		System.out.println("색상명(String) : " + myCar.color);    // String = null
		System.out.println("속도(int) : " + myCar.speed);        // int = 0
		System.out.println("출발여부(boolean) : " + myCar.start); // boolean = false
		System.out.println();

		// myCar 객체의 필드에 값저장
		// myCar.model = .model = 필드이름
		myCar.model = "제네시스";
		myCar.color = "다크블루";
		myCar.speed = 60;
		myCar.start = true;
		myCar.maxSpeed = 300;

		// myCar 객체에 저장된 필드값 조회하기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println("최대속도(int) : " + myCar.maxSpeed);


	}

}
