package com.javalab.class04;

public class StudentMain {

	public static void main(String[] args) {
		
		// StudentData sd = new StudentData();
		// new = 객체 생성자
		StudentData sd = new StudentData(); // StudentData() = 생성자 호출
		Student[] students = sd.students; // 위에서 생성된 StudentData 객체의 필드

		// 학생 데이터를 생성해주는 메소드를 만드세요.
		 //initData(students);

		// [문제.1] 학생 목록을 출력하는 메소드를 만드세요.
		printStudent(students);

		// [문제.2] 여학생들의 명단을 출력하시오.
		printWomanStudent(students);

		// [문제.3] 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받은 이름을 main 메소드에서 출력하세요.
		String[] strName = getSeoulStudent(students); // 반환받은 문자열 배열 저장 변수 선언
		for (String str : strName) {
			System.out.println(str);
		}
	}

	// 학생 데이터를 만들어주는 메소드
	private static void initData(Student[] students) {
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		students[1] = new Student("1292002", "900305-1730021", "김정현", 2, "서울", 20);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		students[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);
	}

	// 서울 사는 3학년 학생들 이름을 구해서 반환하는 메소드
	private static String[] getSeoulStudent(Student[] students) {
		System.out.println("====================== 서울 사는 3학년 이름 ======================");
		String arrName = ""; // 서울 3학년생들의 이름을 이어붙일 String type 변수
		for (Student student : students) {
			if (student.getAddress().equals("서울") && student.getYear() == 3) { // 서울 사는 3학년
				arrName = arrName + student.getName() + ","; // 예) 홍길동,이명수,정명훈,
			}
		}
		String[] resultName = arrName.split(",");
		return resultName;
	}

	// 여학생들 목록을 출력하는 메소드
	private static void printWomanStudent(Student[] students) {
		System.out.println("=========================== 여학생 명단 =======================");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getJumin().substring(7, 8).equals("2")) {
				System.out.printf("%s \t %s \t %s \t %d \t %s \t %d \n", students[i].getId(), students[i].getJumin(),
						students[i].getName(), students[i].getYear(), students[i].getAddress(),
						students[i].getDepartment());
			}
		}
		System.out.println();
	}

	// 학생 목록을 출력하는 메소드
	private static void printStudent(Student[] students) {
		System.out.printf("=============================================================\n");
		System.out.printf("  학번                       주민번호                         이름       학년         주소    학과코드  \n");
		System.out.printf("=============================================================\n");

		for (int i = 0; i < students.length; i++) {
			System.out.printf("%s      %s       %s      %d      %s       %d \n", students[i].getId(),
					students[i].getJumin(), students[i].getName(), students[i].getYear(), students[i].getAddress(),
					students[i].getDepartment());
			// students[i].showStudentInfo();
		}
		System.out.println();
		
		System.out.printf("==============================================================\n");
		System.out.println();

	}

}
