package com.javalab.collection.pkg10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {

		// [문제.1]
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			intArrayList.add(i);
		}

		// 문제 1번 출력
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.print(intArrayList.get(i) + "\t");
		}

		System.out.println();
		System.out.println();

		// [문제.2]
		ArrayList<String> carList = new ArrayList<>();

		carList.add("Volvo");
		carList.add("Benz");
		carList.add("BMW");
		carList.add("Hyendai");

		// 문제 2번 출력
		for (String str : carList) {
			System.out.println(str);
		}

		// [문제.3]
		// 타입 설정 Student 객체만 저장 가능
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		students.add(new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		students.add(new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		// 문제 3번 출력
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
} // end main

class list {

	private int List;

	public list(int List) {
		this.List = List;
	}

	public int getList() {
		return List;
	}

	public void setList(int list) {
		this.List = list;
	}
}

class car {

	private String car;

	public car(String car) {
		super();
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return car;
	}

}
