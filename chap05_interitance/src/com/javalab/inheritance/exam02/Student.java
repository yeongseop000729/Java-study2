package com.javalab.inheritance.exam02;

/**
 * 자손 클래스 extends : 상속받을 부모 클래스 명시하기 위한 키워드 - 부모 클래스의 필드가 자동으로 상속되어 자식의 필드로
 * 만들어짐(눈에 안보임)
 */

public class Student extends Human {

	// 필드
	int stdNo; // 학번
	String major; // 전공

	// 생성자
	
	public void studentInfo() {
		this.humanInfo(); // 부모 정보 출력 메소드 호출
		System.out.println("[Student Info]");
		System.out.println("학번 : " + this.stdNo);
		System.out.println("전공 : " + this.major);
	}

	public Student(String name, int age, int stdNo, String major) {
		super(name, age);
		this.stdNo = stdNo;
		this.major = major;
	}

	public Student(String name, int age) {
		super(name, age);
	}


}
