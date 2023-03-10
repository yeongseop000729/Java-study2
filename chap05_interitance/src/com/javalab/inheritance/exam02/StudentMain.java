package com.javalab.inheritance.exam02;

/**
 * 실행 클래스
 */

public class StudentMain {

	public static void main(String[] args) {

		// 자식 객체 생성 ( 오버로딩 생성자 호출 )
		// Student std = new Student
		//     객체                        생성자

		Student std = new Student("김미소", 23, 202103021, "컴퓨터공학과");
		std.studentInfo();

	}

}
