package com.javalab.class10;

import com.javalab.class10.vo.Department;
import com.javalab.class10.vo.Student;

public class SchoolManagementMain {

	public static void main(String[] args) {

		Student[] students = new Student[8];
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		students[1] = new Student("1292002", "900305-2730021", "김정현", 3, "서울", 923);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 925);
		students[3] = new Student("1292301", "880902-2704012", "김정숙", 2, "대구", 923);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 920);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 925);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 923);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925);

		// 학과 데이터 생성
		Department[] departments = new Department[3];
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "308호");

		// [문제.1] 전체 학생 명단을 출력하되 학생의 소속 학과를 함께 출력하시오.
		String name = "";
		for (Student stu : students) {
			int code = stu.getDepartment(); // 학과 코드
			for (Department department : departments) { // departments 에서 하나씩 꺼내서 department 한테 담아준다.
				if (code == department.getId()) {
					name = department.getName();

				}

			}

			System.out.println(stu.getId() + " " + stu.getJumin() + " " + stu.getName() + " " + stu.getYear() + " "
					+ stu.getAddress() + " " + stu.getDepartment() + " " + name);

		}

	}

}
