package com.javalab.class01;

/**
 * 실행클래스
 */

public class FruitMain {

	public static void main(String[] args) {

		// 객체 한개 생성
		// peach = 클래스 변수 ( 참조 변수 )
		// new = 객체 생성 , Fruit() = 생성자 필드초기화
		Fruit peach = new Fruit();
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);

		// printFruit() = 메소드 메소드 호출
		printFruit(peach);
		System.out.println();

		// 과일 객체 5개 생성
		Fruit apple = new Fruit("사과", 2000, 5);
		Fruit mango = new Fruit("망고", 1000, 2);
		Fruit banana = new Fruit("바나나", 2500, 3);
		Fruit pineapple = new Fruit("파인애플", 5000, 1);
		Fruit orange = new Fruit("오렌지", 6000, 4);

		// 과일 객체 5개 전달해서 받아서 출력하는 메소드 만드세요.
		printFruit(apple, mango, banana, pineapple, orange);
		System.out.println();

		// 과일 객체 5개 담을 수 있는 Array 선언
		Fruit[] fruits = new Fruit[5];
		fruits[0] = apple;
		fruits[1] = mango;
		fruits[2] = banana;
		fruits[3] = pineapple;
		fruits[4] = orange;
		
		printFruit(fruits);

	}

	// 과일 배열을 받아서 출력
	 private static void printFruit(Fruit[] fruits) {
	      for (Fruit fruit : fruits) {
	         System.out.println(fruit.getName() + "\t" + fruit.getPrice() + "\t" + fruit.getQuantity());
	         
	      }
	   }


	// 객체를 출력하는 메소드
	// Fruit = 과일클래스
	// peach = 메모리 공간에 주소
	private static void printFruit(Fruit peach) {
		System.out.println(peach.getName() + " " + peach.getPrice() + " " + peach.getQuantity());
		System.out.println();
	}

	// Fruit 타입 필수
	private static void printFruit(Fruit apple, Fruit mango, Fruit banana, Fruit pineapple, Fruit orange) {

		System.out.println(apple.getName() + " " + apple.getPrice() + " " + apple.getQuantity());
		System.out.println(mango.getName() + " " + mango.getPrice() + " " + mango.getQuantity());
		System.out.println(banana.getName() + " " + banana.getPrice() + " " + banana.getQuantity());
		System.out.println(pineapple.getName() + " " + pineapple.getPrice() + " " + pineapple.getQuantity());
		System.out.println(orange.getName() + " " + orange.getPrice() + " " + orange.getQuantity());
		System.out.println();
	}
}
