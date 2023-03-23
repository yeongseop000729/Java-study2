package com.javalab;

import java.util.ArrayList;
import java.util.List;

/**
 * 학생행정 실행클래스
 *  - 특징으로는 여러 개의 객체를 조인해서 결과를 뽑아낸다.(학생정보 + 학과정보)
 * ArrayList에서 하나씩 꺼내는 삽화(이미지) 있음
 */
public class SchoolManagementMain {

	public static void main(String[] args) {
		
		// 학생, 교수, 학과, 성적 데이터 저장용 ArrayList 생성
		List<Student> studentList = new ArrayList<Student>(); // 학생 ArrayList
		List<Professor> professorList = new ArrayList<Professor>(); // 교수 ArrayList
		List<Department> departmentList = new ArrayList<Department>();	// 학과 ArrayList
		List<Takes> takesList = new ArrayList<Takes>();	// 성적 ArrayList
		
		//학생 데이터 생성
		studentList.add(new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920));
		studentList.add(new Student("1292002", "900305-2730021", "김정현", 3, "서울", 923));
		studentList.add(new Student("1292003", "891021-2308302", "김현정", 4, "대전", 925));	
		studentList.add(new Student("1292301", "880902-2704012", "김정숙", 2, "대구", 923));
		studentList.add(new Student("1292303", "910715-1524390", "박광수", 3, "광주", 920));
		studentList.add(new Student("1292305", "921011-1809003", "김우주", 4, "부산", 925));
		studentList.add(new Student("1292501", "900825-1506390", "박철수", 3, "대전", 923));
		studentList.add(new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925));

		// 교수 데이터 생성
		professorList.add(new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997"));
		professorList.add(new Professor("92002", "690702-1350026", "고희석", 923, "교수", "2003"));
		professorList.add(new Professor("92301", "741011-2765501", "최성희", 920, "부교수", "2005"));		
		professorList.add(new Professor("92302", "750728-1102458", "김태석", 923, "부교수", "1999"));
		professorList.add(new Professor("92501", "620505-1200546", "박철재", 925, "교수", "2007"));		
		professorList.add(new Professor("92502", "740101-1830264", "장민석", 920, "조교수", "2005"));

		// 학과 데이터 생성
		departmentList.add(new Department(920, "컴퓨터공학과", "201호"));
		departmentList.add(new Department(923, "산업공학과", "207호"));
		departmentList.add(new Department(925, "전자공학과", "308호"));
		
		// 성적 데이터 생성
		takesList.add(new Takes("1292001", "C101-01", "B+"));
		takesList.add(new Takes("1292001", "C103-01", "A+"));
		takesList.add(new Takes("1292001", "C301-01", "A"));
		takesList.add(new Takes("1292002", "C102-01", "A"));
		takesList.add(new Takes("1292002", "C103-01", "B+"));
		takesList.add(new Takes("1292002", "C502-01", "C+"));
		takesList.add(new Takes("1292003", "C103-02", "B"));
		takesList.add(new Takes("1292003", "C501-02", "A+"));
		takesList.add(new Takes("1292301", "C102-01", "C+"));
		takesList.add(new Takes("1292303", "C102-01", "C"));
		takesList.add(new Takes("1292303", "C103-02", "B+"));
		takesList.add(new Takes("1292303", "C501-01", "A+"));	
		
		// [문제.1] 전체 학생 리스트를 출력하는 메소드 호출
		System.out.println("1. 전체 학생 리스트를 출력");
		printAllStudent(studentList);
		System.out.println();
		System.out.println();
		
		// [문제.1.2] 교수 리스트를 출력 메소드 호출
		System.out.println("1.2. 교수 리스트를 출력");
		printAllProfessor(professorList);
		System.out.println();
		System.out.println();
		
		// [문제.1.3] 학과 리스트 출력 메소드 호출
		System.out.println("1.3. 학과 리스트 출력");
		printAllDepartment(departmentList);
		System.out.println();
		System.out.println();
		
		// [문제.1.4] 성적 데이터 출력메소드 호출
		System.out.println("1.4. 성적 데이터 출력");
		printAllTakes(takesList);
		System.out.println();
		System.out.println();
		
		// [문제.2] 전체 학생 명단을 출력하되 학생의 소속 학과를 함께 출력하는 메소드 호출
		System.out.println("2. 전체 학생 명단을 출력하되 학생의 소속 학과를 함께 출력");
		printStudentDepartment(studentList, departmentList);
		System.out.println();
		System.out.println();
		
		// [문제.3] 학생  데이터와  그 학생의 성적을 함께 출력하시오.
		System.out.println("3. 학생  데이터와  그 학생의 성적을 함께 출력");
		printStudentTakes(studentList, takesList);
		System.out.println();
		System.out.println();
		
		// [문제.4] 특정 지역을 전달하면 해당 지역에 사는  남학생을 찾아서 ArrayList로 반환해주는 메소드 호출
		System.out.println("4. 특정 지역의 남학생 조회");
		String local = "대전";
		List<Student> studentList2 = getManInSeoul(studentList, local);
		for (Student student : studentList2) {
			System.out.println(student.getId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t" + student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment());
		}
		System.out.println();
		System.out.println();
		
		// [문제.5] 특정 학과를 전달하면 해당 학과 학생들을 찾아서 ArrayList로 반환해주는 메소드 호출 
		System.out.println("5. 특정 학과 학생들 조회");
		String deptName = "컴퓨터공학과";
		List<Student> studentList3 = getStudentByDept(studentList, departmentList, deptName);
		for (Student student : studentList3) {
			System.out.println(student.getId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t" + student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment());
		}
		
	}

	/**
	 * 특정 학과에 소속된 학생들을 찾아서 반환해주는 메소드
	 * @param studentList
	 * @param departmentList
	 * @param deptName
	 * @return
	 */
	private static List<Student> getStudentByDept(List<Student> studentList, 
													List<Department> departmentList, 
													String deptName) {
		// 1. 특정 학과(컴퓨터공학과)의 departmentId찾기(920)
		int departmentId = 0;
		for (Department department : departmentList) {
			if(department.getName().equals(deptName)) { // 파라미터로 전달받은 학과와 같은 학과 찾기
				departmentId = department.getId();
			}
		}
		
		// 해당 학과 학생들 선별
		List<Student> studentList2 = new ArrayList<Student>();
		for (Student student : studentList) {
			if(student.getDepartment() == departmentId) {
				studentList2.add(student);
			}
			
		}
		return studentList2;
	}

	/**
	 * 특정 학과를 전달받아서 해당 학과의 학생들을 찾아주는 메소드
	 * @param departmentList
	 * @param strDept
	 * @return
	 */
	private static List<Department> getDepartment(List<Department> departmentList, String strDept) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 서울에 사는 남학생을 찾아서 ArrayList로 반환해주는 메소드
	 * 2000이전 주민번호
	 * @param studentList
	 * @return
	 */
	private static List<Student> getManInSeoul(List<Student> studentList, String local) {
		char c = ' '; 			// 주민번호 뒷자리 첫글자 저장용 지역변수, (char type은 ' '로 초기화)
		String jumin = "";		// 주민번호 저장용 지역변수
		List<Student> studentList2 = new ArrayList<Student>();
		
		for(Student student : studentList) {
			jumin = student.getJumin();	// 주민번호 전체 갖고와서
			c = jumin.charAt(7);		// 주민번호 뒷자리 첫글자 한자 추출(7번 인덱스)
			
			//주민번호 뒤에 첫째자리(1-남자, 2-여자) + 주소가 "서울"인 학생
			if(c == '1' && student.getAddress().equals(local)) {
				studentList2.add(student);
			}
		}
		return studentList2;
	}

	/**
	 * 학생과 성적정보를 출력하는 메소드
	 * @param studentList
	 * @param takesList
	 */
	private static void printStudentTakes(List<Student> studentList, List<Takes> takesList) {
		for(Student s : studentList) {
			for(Takes t : takesList) {
				if(s.getId().equals(t.getId())) {
					System.out.println(s.getId() + "\t " + s.getName() +  "\t" + s.getJumin() +  "\t" + s.getYear() 
                               +  "\t" + s.getAddress() +  "\t" + s.getDepartment() +  "\t" + t.getSubject() 
                               + "\t" + t.getScore());
				}
			}
		}		
		
	}

	/**
	 * 학생명단 + 학과를 함께 출력해주는 메소드
	 * @param studentList
	 * @param departmentList
	 */
	private static void printStudentDepartment(List<Student> studentList, List<Department> departmentList) {
		int tempDeptId = 0;
		String deptName = "";
		
		for(Student s : studentList) {
			tempDeptId = s.getDepartment();		//학생의 학과  id
			for(Department d : departmentList) {
				if(tempDeptId == d.getId()) {	//학생의 학과 id와 학과 테이블의 학과 id 비교
					deptName = d.getName(); 	//학과명 추출
				}
			}
			System.out.println(s.getId() + "\t " + s.getName() +  "\t" + s.getJumin() +  "\t" + s.getYear() 
                                   +  "\t" + s.getAddress() +  "\t" + s.getDepartment() +  "\t" + deptName);
		}
	}

	/**
	 * 성적 데이터 출력 메소드
	 * @param takesList
	 */
	private static void printAllTakes(List<Takes> takesList) {
		for(Takes takes : takesList) {
			System.out.println(takes.getId() + "\t" + takes.getSubject() + " \t" + takes.getScore());
		}
		
	}

	/**
	 * 학과 목록 출력 메소드
	 * @param departmentList
	 */
	private static void printAllDepartment(List<Department> departmentList) {
		for(Department department : departmentList) {
			System.out.println(department.getId() + "\t" + department.getName() + " \t" + department.getOffice());
		}
	}

	/**
	 * 교수 목록 출력 메소드
	 * @param professorList
	 */
	private static void printAllProfessor(List<Professor> professorList) {
		for(Professor professor : professorList) {
			System.out.printf("%s  %s  %s  \n", professor.getId(), professor.getJumin(), professor.getName());
		}
	}

	/**
	 * 학생 목록 출력 메소드
	 * @param studentList
	 */
	private static void printAllStudent(List<Student> studentList) {
		for(Student student : studentList) {
			System.out.println(student.getId() + " " + student.getName() +  " " + student.getJumin() +  " " + student.getYear() 
                               +  " " + student.getAddress() +  " " + student.getDepartment());
		}
	}


}