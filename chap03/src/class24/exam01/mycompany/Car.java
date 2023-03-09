package class24.exam01.mycompany;

import class24.exam01.hankook.SnowTire;
import class24.exam01.hyundai.Engine;
import class24.exam01.kumho.BigWidthTire;

// 한지붕 두가족 Car, main메소드

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();

	// 같은 클래스 타입으로 두개의 import가 안된다.
	// Tire tire10 = new Tire(); // kumho
	// Tire tire11 = new Tire(); // hankook 패키지의 Tire를 쓰려면 아래와 같이 복잡한 과정을 거쳐야

	class24.exam01.kumho.Tire tire3 = new class24.exam01.kumho.Tire();
	class24.exam01.hankook.Tire tire4 = new class24.exam01.hankook.Tire();

	public static void main(String[] args) {
		Car myCar = new Car();
	}
}
