package class05;

/**
 * 실행 클래스 
 * - main 메소드가 있어서 실행할 수 있는 클래스 
 * - 라이브러리 클래스를 객체로 만들어서 이용하는 클래스
 */

public class CarMain {

	public static void main(String[] args) {

		/**
		 * Car 객체 생성
		 * - 객체 생성과 동시에 색상정보 저장
		 */
		Car myCar = new Car("다크블루"); // 또다른 생성자 호출
		System.out.println("자동차의 색상은 : " + myCar.color + "입니다.");

		Car myCar2 = new Car("빨간색"); // 또다른 생성자 호출
		System.out.println("자동차의 색상은 : " + myCar2.color + "입니다.");

		/**
		 * 기본 생성자는 호출할 수 없다. 
		 * 왜냐하면 Car 클래스에 기본 생성자가 아닌 다른 생성자가 있으면 
		 * 컴파일러가 기본 생성자를 만들어 주지 않는다. 
		 * 기본 생성자를 사용하려면 만들어 줘야 한다.
		 */
		Car myCar3 = new Car(); // = 컴파일러가 기본 생성자를 만들어주지 않아서 에러가 난다

	}

}
