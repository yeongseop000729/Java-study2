package com.javalab;

/**
 * 교수 클래스
[Professor raw Data]  
  교수ID       주민번호          	  성명    	학과  grade 	입사일자
("92001", "590327-1839240", "이태규", 920, "교수", "1997-01-29")
("92002", "690702-1350026", "고희석", 910, "부교수", "2003")
("92301", "741011-2765501", "최성희", 910, "부교수", "2005")
("92302", "750728-1102458", "김태석", 920, "교수", "1999")
("92501", "620505-1200546", "박철재", 900, "조교수", "2007")
("92502", "740101-1830264", "장민석", 910, "부교수", "2005")
 */
public class Professor {
	
	// 필드
	private String id;
	private String jumin;
	private String name;
	private int department;
	private String grade;
	private String hiredate;

	// 기본생성자
	public Professor() {
	}

	// 오버로딩 생성자
	public Professor(String id, String jumin, String name, int department, String grade, String hiredate) {
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.department = department;
		this.grade = grade;
		this.hiredate = hiredate;
	}

	// getter/setter 메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	/**
	 * 교수 클래스가 갖고 있는 내부 데이터를 문자열 형태로 외부에 전달해줌.
	 * @Override : 모든 자바 클래스의 최고 조상인 Object 클래스가 갖고 있는
	 * 			   toString()메소드를 재정의함.
	 */	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", jumin=" + jumin + ", name=" + name + ", department=" + department + ", grade="
				+ grade + ", hiredate=" + hiredate + "]";
	}


}