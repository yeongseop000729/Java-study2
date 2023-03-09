package class26.exam03;

/**
 * 사원 클래스 모델링 (설계) 연습 
 * 사원 클래스의 필드는 다음과 같아. 
 * - 필드 : 사원번호, 사원명, 직급, 급여 
 * - 생성자 : 기본생성자, 오버로딩 생성자 구현 
 * - 객체의 정보를 제공해주는 메소드 구현
 */

public class Employee {

	// 인스턴스멤버(필드) 선언 영역
	public int empNo; // 사원번호
	public String eName; // 사원명
	public String position; // 직급
	public int salary; // 급여

	// 기본생성자 ( 초기화 하는 용도 )
	public Employee() {
	}

	// 생성자 오버로딩
	// 객체를 생성하면서 인자를 전달받고 그 값으로 객체 초기화
	// this : 현재 객체 자신을 가리킴
	public Employee(int empNo, String eName, String position, int salary) {
		this.empNo = empNo;
		this.eName = eName;
		this.position = position;
		this.salary = salary;
	}

}
