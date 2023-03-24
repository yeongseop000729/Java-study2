package com.javalab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 콘솔 화면에 보여줄 메뉴와 입력된 객체들에 관한 정보를 
 * 저장할 ArrayList를 
 * 필드로 갖고 있는 클래스
 */
public class MenuSelect {
	// 필드
	ArrayList<Student> studentList = new ArrayList<Student>(); // 학생 ArrayList
	List<Professor> professorList = new ArrayList<Professor>(); // 교수 ArrayList
	List<Department> departmentList = new ArrayList<Department>(); // 학과 ArrayList
	List<Takes> takesList = new ArrayList<Takes>(); // 성적 ArrayList

	// 키보드에서 입력받을 Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	int ch;

	// 콘솔 화면에서 보여질 메인 메뉴를 보여주는 메소드
	public void displayMenu() {

		System.out.println("===================================");
		System.out.println("작업을 선택하세요.");
		System.out.println("-----------------------------------");
		System.out.println("1. 학생등록");
		System.out.println("2. 교수등록");
		System.out.println("3. 학과등록");
		System.out.println("4. 성적등록");
		System.out.println("5. 학생조회");
		System.out.println("6. 교수조회");
		System.out.println("7. 학과조회");
		System.out.println("8. 성적조회");
		System.out.println("9. 종료");
		System.out.println("===================================");
	}

	// 사용자가 키보드로 입력한 값을 입력 받는 메소드
	public void selectMenu() {
		while (true) {
			displayMenu();
			System.out.println("작업을 선택하세요.");
			ch = scanner.nextInt();
			switch (ch) {
			case 1: // 학생등록
				System.out.println("1.학생등록 메뉴를 선택하셨습니다.");
				System.out.println("학번?");
				String id = scanner.next();
				System.out.println("학생명?");
				String name = scanner.next();
				System.out.println("학생 주민번호?");
				String jumin = scanner.next();
				System.out.println("학년?");
				int year = scanner.nextInt();
				System.out.println("주소?");
				String address = scanner.next();
				System.out.println("학과?");
				int department = scanner.nextInt();

				Student student = new Student(id, jumin, name, year, address, department);
				studentList.add(student);

				System.out.println("학생 정보가 성공적으로 저장되었습니다.");

				break;
			case 2: // 교수 등록
				System.out.println("2. 교수등록 메뉴를 선택하셨습니다.");
				System.out.println("교수id?");
				id = scanner.next();
				System.out.println("교수명?");
				name = scanner.next();
				System.out.println("교수 주민번호?");
				jumin = scanner.next();
				System.out.println("입사일?");
				String hiredate = scanner.next();
				System.out.println("구분?");
				String grade = scanner.next();
				System.out.println("학과?");
				department = scanner.nextInt();

				Professor professor = new Professor(id, jumin, name, department, grade, hiredate);
				professorList.add(professor);

				System.out.println("교수 정보가 성공적으로 저장되었습니다.");
				break;
			case 3: // 학과등록
				System.out.println("3. 학과 등록  메뉴를 선택하셨습니다.");
				System.out.println("학과번호(id) : int)?");
				department = scanner.nextInt();
				System.out.println("학과명?");
				name = scanner.next();
				System.out.println("교실?");
				String office = scanner.next();

				Department department1 = new Department(department, name, office);
				departmentList.add(department1);

				System.out.println("학과 정보가 성공적으로 저장되었습니다.");
				break;
			case 4: // 성적 등록
				System.out.println("4. 성적 등록  메뉴를 선택하셨습니다.");
				System.out.println("학생번호(id) : int)?");
				String studentId = scanner.next();
				System.out.println("과목명?");
				String subject = scanner.next();
				System.out.println("점수?");
				String score = scanner.next();

				Takes takes = new Takes(studentId, subject, score);
				takesList.add(takes);

				System.out.println("성적 정보가 성공적으로 저장되었습니다.");
				break;

			case 5: // 학생 목록 조회
				studentList.forEach(System.out::println);
				break;
			case 6: // 교수 목록 조회
				professorList.forEach(System.out::println);
				break;
			case 7: // 학과 목록 조회
				departmentList.forEach(System.out::println);
				break;
			case 8: // 성적 목록 조회
				takesList.forEach(System.out::println);
				break;
			case 9: // 종료
				System.out.println("프로그램 종료를 선택하셨습니다. bye~");
				System.exit(0);
				break;
			default:
				System.out.println("프로그램 종료를 선택하셨습니다. bye~");
				System.exit(0);

			}// end switch
		} // end while
	}// end main
}// end class