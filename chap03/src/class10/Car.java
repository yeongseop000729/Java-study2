package class10;

/**
 * this() : 다른 생성자를 호출할 때 사용함.
 */

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car(String model) {
		// 다른 생성자 호출
		this(model, "은색", 250); // 생성자의 첫줄에 작성
	}

	Car(String model, String color) {
		// 다른 생성자 호출
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
