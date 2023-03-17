package com.javalab.collection.pkg07_01;

public class HashMapMain {

	public static void main(String[] args) {

		// 1. 과일 객체 생성
		Fruit apple = new Fruit("Apple", 3000);
		Fruit banana = new Fruit("Banana", 3500);
		Fruit orange = new Fruit("Orange", 4000);

		// 2. 과일 객체를 담을 박스 객체 생성
		Box<Fruit> box = new Box<Fruit>();
		box.addItem(apple); // 박스 객체에 과일
		box.addItem(banana);
		box.addItem(orange);

		// 3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println(fruit.getName() + " " + fruit.getPrice());
		}
		System.out.println();

		// 4. 야채 객체 생성
		Vegitable 시금치 = new Vegitable("시금치", 1500);
		Vegitable 양배추 = new Vegitable("양배추", 2500);
		Vegitable 대파 = new Vegitable("대파", 3500);

		// 5. 야채를 담을 박스 객체 생성
		// 박스에 야채 객체 담기(저장)
		Box<Vegitable> vbox = new Box<>();
		vbox.addItem(시금치);
		vbox.addItem(양배추);
		vbox.addItem(대파);

		// 6. 바스에서 야채 조회/출력
		for (Vegitable vegitable : vbox.getItems()) {
			System.out.println(vegitable.getName() + " " + vegitable.getPrice());

		}
	}
}
