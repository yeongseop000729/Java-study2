package class04;

/**
 * 실행 클래스
 * 기본 생성자를 통한 객체 생성
 */

public class CarMain {

	public static void main(String[] args) {
		
		
		// 1. Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출
		Car myCar2 = new Car();  // 기본 생성자 호출
		
		System.out.println("객체의 주소 : " + myCar + " \n " + myCar2);

	}

}
