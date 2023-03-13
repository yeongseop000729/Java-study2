package com.javalab.inheritance.exam08;

public class SchoolManagementMain {

	public static void main(String[] args) {

		// raw data를 가공해서 저장할 부모 타입 Array 선언
		Person[] persons = new Person[5];

		// Array에 학생과 교수 정보 저장(자동 타입 변환)
		persons[0] = new Student("김보희", 20, "alice@example.com", "컴퓨터공학과", "72345678");
		persons[1] = new Student("미정이", 19, "bob@hotmail.com", "문헌정보학과", "87654321");
		persons[2] = new Student("채필립", 22, "marine@google.com", "영문학과", "6587658");
		persons[3] = new Professor("김명룡", 45, "charlie@example.com", "문헌정보학과", "13265872");
		persons[4] = new Professor("이덕임", 50, "diana@example.com", "컴퓨터공학과", "23456789");

		// 다형성을 이용하여 학생과 교수 정보 출력
		System.out.println("============학생 & 교수===========");
		for (Person person : persons) {
			person.printInfo();
			System.out.println("------------------------------");
		}
		System.out.println("===============================");
	}
}