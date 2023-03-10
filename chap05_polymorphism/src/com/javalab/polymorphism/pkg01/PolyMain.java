package com.javalab.polymorphism.pkg01;

import java.util.Scanner;

public class PolyMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Parent parent = null; // = 생명력은 while문 안에랑 밖에서 사용할수있다

		while (true) {
			System.out.println("============================");
			System.out.println("성격을 알고 싶은 자녀를 선택하세요.");
			System.out.println("1. 첫째");
			System.out.println("2. 둘쨰");
			System.out.println("3. 셋쨰");
			System.out.println("4. 종료");
			System.out.println();

			// 키보드에서 Scanner를 사용해서 점수 입력받음
			// nextLine = 받으면 문자열 그렇기 떄문에 String 타입으로 해야한다.
			String no = scanner.nextLine();

			if (no.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (no.equals("1")) {
				// (Parent) 자동 형 변환 연산자
				parent = (Parent) new Child1(); // 필드의 다형성(자식객체를 부모 타입에 저장)

			} else if (no.equals("2")) {
				parent = (Parent) new Child2(); // 필드의 다형성(자식객체를 부모 타입에 저장)

			} else if (no.equals("3")) {
				parent = (Parent) new Child3(); // 필드의 다형성(자식객체를 부모 타입에 저장)

			}
			// 자식이 오버라이딩 해서 부모꺼를 호출하지만 자식의 메소드가 호출되는거다
			// 부모는 1타입 자식은 3타입 
			parent.showPersonality(); // 부모 타입으로 호출하지만 자식의 메소드가 호출됨

		}

	}

}
