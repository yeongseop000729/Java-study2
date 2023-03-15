package com.javalab.api.pkg02;

/*
 * Member 클래스의 객체의 값을 비교하는 실행클래스
 */

public class EqualsExample {

	public static void main(String[] args) {

		// obj1 이랑 obj2는 다르다 왜냐하면 새로운 객체를 만들어서 넣었기때문에
		// obj1 과 obj2는 전혀 다른 객체이다.
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}

}
