package com.javalab;

/**
 * 학과 클래스
 * 920, "컴퓨터공학과", "201호"
 * 923, "산업공학과", 	"207호"
 * 925, "전자공학과", 	"308호"
 */
public class Department {
	// 필드(멤버변수, 인스턴스변수)
	private int id;				//학과 코드
	private String name;		//학과명
	private String office;		//교실
	
	// 기본 생성자
	public Department() {		
	}	
	
	// 오버로딩 생성자
	public Department(int id, String name, String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}

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
	
	// 부서 클래스가 갖고 있는 내부 데이터를 문자열 형태로 외부에 전달해줌.
	public String showDepartmentInfo() {
		return this.id + "\t" + this.name + "\t" + this.office;
	}

	/**
	 * 부서 클래스가 갖고 있는 내부 데이터를 문자열 형태로 외부에 전달해줌.
	 * @Override : 모든 자바 클래스의 최고 조상인 Object 클래스가 갖고 있는
	 * 			   toString()메소드를 재정의함.
	 */	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", office=" + office + "]";
	}


}
