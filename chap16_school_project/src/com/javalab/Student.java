package com.javalab;
/**
 *  학번			주민번호			이름	 학년	  주소		학과
("1292001", "900424-1825409", "김광식", 3, "서울", 92)
("1292002", "900305-1730021", "김정현", 3, "서울", 20)
.("1292003", "891021-2308302", "김현정", 4, "대전", 55)
("1292301", "890902-2704012", "김현정", 2, "대구", 78)
("1292303", "910715-1524390", "박광수", 3, "광주", 54)
("1292305", "921011-1809003", "김우주", 4, "부산", 88)
("1292501", "900825-1506390", "박철수", 3, "대전", 73)
("1292502", "911011-1809003", "백태성", 3, "서울", 95)
 */
/**
 * 학생클래스
 */
public class Student {

	private String id;			//학번
	private String jumin; 		//주민번호
	private String name; 		//이름
	private int year;			//학년
	private String address;		//주소
	private int department;		//학과code
	
	//기본 생성자
	public Student() {		
	}
	
	//오버로딩 생성자
	public Student(String id, String jumin, String name, int year, String address, int department) {
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.address = address;
		this.department = department;
	}

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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	/**
	 * 학생 클래스가 갖고 있는 내부 데이터를 문자열 형태로 외부에 전달해줌.
	 * @Override : 모든 자바 클래스의 최고 조상인 Object 클래스가 갖고 있는
	 * 			   toString()메소드를 재정의함.
	 */	
	@Override
	public String toString() {
		return "Student [id=" + id + ", jumin=" + jumin + ", name=" + name + ", year=" + year + ", address=" + address
				+ ", department=" + department + "]";
	}	

}