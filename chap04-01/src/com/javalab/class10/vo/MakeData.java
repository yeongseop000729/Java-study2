package com.javalab.class10.vo;

public class MakeData {
	
	// field
	public Student[] students = new Student[8];
	public Department[] departments = new Department[3];
	public Takes[] takes = new Takes[12];
	public Professor[] professors = new Professor[6];

	// 기본 생성자
	public MakeData() {
		
		// 학생 데이터 생성
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		students[1] = new Student("1292002", "900305-2730021", "김정현", 3, "서울", 923);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 925);
		students[3] = new Student("1292301", "880902-2704012", "김정숙", 2, "대구", 923);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 920);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 925);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 923);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925);

		// 학과 데이터 생성
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "308호");

		// 성적 데이터 생성
		takes[0] = new Takes("1292001", "C101-01", "B+");
		takes[1] = new Takes("1292001", "C103-01", "A+");
		takes[2] = new Takes("1292001", "C301-01", "A");
		takes[3] = new Takes("1292002", "C102-01", "A");
		takes[4] = new Takes("1292002", "C103-01", "B+");
		takes[5] = new Takes("1292002", "C502-01", "C+");
		takes[6] = new Takes("1292003", "C103-02", "B");
		takes[7] = new Takes("1292003", "C501-02", "A+");
		takes[8] = new Takes("1292301", "C102-01", "C+");
		takes[9] = new Takes("1292303", "C102-01", "C");
		takes[10] = new Takes("1292303", "C103-02", "B+");
		takes[11] = new Takes("1292303", "C501-01", "A+");

		// 교수 데이터 생성
		professors[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		professors[1] = new Professor("92002", "690702-1350026", "고희석", 923, "교수", "2003");
		professors[2] = new Professor("92301", "741011-2765501", "최성희", 920, "부교수", "2005");
		professors[3] = new Professor("92302", "750728-1102458", "김태석", 923, "부교수", "1999");
		professors[4] = new Professor("92501", "620505-1200546", "박철재", 925, "교수", "2007");
		professors[5] = new Professor("92502", "740101-1830264", "장민석", 920, "조교수", "2005");
	}

}
