package class26.exam03;

/**
 * 사원 정보 조회 및 출력
 * 
 * 1. 빈객체 생성후 값저장 
 * 2. 객체 생성하면서 초기값 전달(값저장)
 */
public class EmployeeMain {

	public static void main(String[] args) {

		// 1. 빈객체 생성
		Employee em = new Employee();

		// 1.1 빈객체의 필드에 값저장
		em.empNo = 2005031002;
		em.eName = "배준섭";
		em.position = "과장";
		em.salary = 500;

		// 1.2 객체의 정보 조회 ( 출력 )
		// 객체 정보 조회
		System.out.println(em.empNo + " " + em.eName + " " + em.position + " " + em.salary);
		System.out.println();

		// 2. 오버로딩 생성자 활용한 객체 생성
		Employee em2 = new Employee(202101003, "김홍철", "사원", -250);

		// 2.2 객체의 정보 조회 ( 출력 )
		System.out.println(em2.empNo + " " + em2.eName + " " + em2.position + " " + em2.salary);
		System.out.println();
		// 3. 객체 배열
		System.out.println("객체 배열을 통한 사원 정보 조회");
		System.out.println();
		// Employee 배열 3자리
		Employee[] emps = new Employee[3];

		emps[0] = new Employee(202301001, "김수희", "대리", 310);
		emps[1] = new Employee(202301001, "박미선", "사원", 280);
		emps[2] = new Employee(202301001, "최무림", "과장", 400);

		// 3.1 첫번쨰 사원 정보 출력
		System.out.println(emps[0].empNo + " " + emps[0].eName + " " + emps[0].position + " " + emps[0].salary);
		// 3.2 첫번쨰 사원 정보 출력
		System.out.println(emps[1].empNo + " " + emps[1].eName + " " + emps[1].position + " " + emps[1].salary);
		// 3.3 첫번쨰 사원 정보 출력
		System.out.println(emps[2].empNo + " " + emps[2].eName + " " + emps[2].position + " " + emps[2].salary);
		System.out.println();

		// for문을 이용한 사원 정보 출력
		for (int i = 0; i < emps.length; i++) {
		System.out.println(emps[i].empNo + " " + emps[i].eName + " " + emps[i].position + " " + emps[i].salary);
		}
		System.out.println();
		
		// 향상된 for문을 이용한 사원 정보 출력
		for (Employee em3 : emps) {
			System.out.println(em3.empNo+ "\t" + em3.eName + "\t" + em3.position + "\t" + em3.salary);
		}
		System.out.println();
		// 6. 전 사원들의 급여 총액 ( 향상된 for문 )
		int sum = 0;
		for (Employee employee : emps) {
			sum += employee.salary;
		}
		System.out.printf("전사원의 급여 총액은 %d입니다.", sum);
		
	 }

}
