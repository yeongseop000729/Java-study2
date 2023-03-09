package com.javalab.class10;

import com.javalab.class10.vo.Department;
import com.javalab.class10.vo.MakeData;
import com.javalab.class10.vo.Professor;
import com.javalab.class10.vo.Student;
import com.javalab.class10.vo.Takes;

public class SchoolManagementMain {

	public static void main(String[] args) {

		MakeData md = new MakeData();
		Student[] students = md.students;
		Department[] departments = md.departments;
		Takes[] takes = md.takes;
		Professor[] professors = md.professors;

		// [문제.1] 전체 학생 명단을 출력하되 학생의 소속 학과를 함께 출력하시오.
		System.out.println("============ 1.학생 정보와 소속학과명 ============");

		int tempDeptId = 0;
		for (Student s : students) {
			tempDeptId = s.getDepartment(); // 학과 코드
			for (Department d : departments) { // departments 에서 하나씩 꺼내서 department 한테 담아준다.
				if (tempDeptId == d.getId()) {
					System.out.println(s.getId() + " " + s.getJumin() + " " + s.getName() + " " + s.getYear() + " "
							+ s.getAddress() + " " + s.getDepartment() + " " + d.getName());
				}
			}
		}
		System.out.println(); // 한줄을 띄는 용도

		// [문제.2] 학생 데이터와 그 학생의 성적을 함께 출력하세요. -학생(Student) + 성적(Takes)

		System.out.println("============ 2.학생(Student)정보 + 성적(Takes) ============");
		System.out.println(" 학번  \t  이름              주민번호            학년             주소       학과번호      과목코드   성적");

		for (Student stu : md.students) {
			for (Takes tak : md.takes) {
				if (stu.getId().equals(tak.getId())) {
					System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getJumin() + "\t" + stu.getYear()
							+ "\t" + stu.getAddress() + "\t" + stu.getDepartment() + "\t" + tak.getSubject() + "\t"
							+ tak.getScore());
				}
			}
		}
		System.out.println(); // 한줄을 띄는 용도

		// [문제.3] 컴퓨터공학과 교수들을 모두 조회하세요
		// 1. 학과배열에서 컴퓨터 공학과 코드를 찾기
		// 2. 코드로 교수 배열에 해당하는 교수 찾기

		System.out.println("=========== 교수중에서 컴퓨터 공학과 교수들을 모두 조회하시오.===========");
		String searchDept = "컴퓨터공학과";
		int dId = 0; // 컴퓨터공학과의 id 저장용 변수
		for (Department dept : md.departments) {
			if (dept.getName().equals(searchDept)) {
				dId = dept.getId(); // 컴퓨터 공학과 id
			}
		}
		for (Professor pro : md.professors) {
			if (pro.getDepartment() == dId) {
				System.out.println(pro.getId() + "\t" + pro.getJumin() + "\t" + pro.getName() + "\t"
						+ pro.getDepartment() + "\t" + searchDept);
			}
		}
	} // end main
}
