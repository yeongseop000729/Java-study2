package com.javalab.class05;

/*
 * 학과 클래스
 */

// 필드(멤버변수, 인스턴스변수)
public class Department {
	private int id; // 학과 코드
	private String name; // 학과명
	private String office; // 교실

	// 기본 생성자 // 기본 생성자 역할 자기 필드 챙김 = 초기화시킨다
	public Department() {
	}

	// 오버로딩 생성자
	public Department(int id, String name, String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}
	
	// getter setter 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

}
