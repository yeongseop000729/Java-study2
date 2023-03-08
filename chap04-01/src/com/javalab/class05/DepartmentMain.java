package com.javalab.class05;

public class DepartmentMain {
	public static void main(String[] args) {

		// Department type의 배열 변수 departments
		Department[] departments = new Department[3];

		// 기초데이터 생성
		initData(departments);

		// [문제.1] 학과 목록을 출력하시오.
		printDepartment(departments);

		// [문제.2] 학과 코드(id)가 "923"인 학과의 코드(ID), name, office를 출력하시오
		getDepartment(departments);

		// [문제.3] 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요.
		String office = getOffice(departments);
			System.out.println("컴퓨터공학과 교실은" + " " + office + " " + "입니다");

	} // end main

	// 학과 데이터 생성
	private static void initData(Department[] departments) {
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "308호");
		System.out.println("[문제.1] 학과 목록을 출력하시오.");
	}

	// [문제.1] 학과 목록을 출력하시오.
	private static void printDepartment(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department.getId() + " " + department.getName() + " " + department.getOffice());
		}
		System.out.println();
		System.out.println("[문제.2] 학과 코드(id)가 923인 학과의 코드(ID), name, office를 출력하시오");
	}

	// [문제.2] 학과 코드(id)가 "923"인 학과의 코드(ID), name, office를 출력하시오
	private static void getDepartment(Department[] departments) {
		for (Department department : departments) {
			if (department.getId() == 923) {
				System.out.println(department.getId() + " " + department.getName() + " " + department.getOffice());

			}

		}
		System.out.println();
		System.out.println("[문제.3] 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요.");
	}

	// [문제.3] 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요.
	private static String getOffice(Department[] departments) {
		
		String arrName = "";
		for (Department department : departments) {
			if (department.getName().equals("컴퓨터공학과")) {
				arrName = arrName + department.getOffice();

			}

		}
	String name = arrName;
	return name;
	}

}

