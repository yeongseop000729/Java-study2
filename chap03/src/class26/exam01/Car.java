package class26.exam01;

public class Car {

	// 필드, 멤버변수, 인스턴스필드
	String maker;
	String model;
	int cc;
	String color;
	int price;
	int maxSpeed;
	int speed;

	// 기본 생성자
	public Car() {
	}

	// 오버로딩 생성자
	public Car(String ma, String mo, int c, String co, int pr, int max, int sp) {
		maker = ma;
		model = mo;
		cc = c;
		color = co;
		price = pr;
		maxSpeed = max;
		speed = sp;
	}
	
	// 생성된 객체의 정보를 보여주는 메소드[속성에 대한 기능]
	public void showCarInfo() {
		System.out.println("maker : " + this.maker);
		System.out.println("model : " + this.model);
		System.out.println("cc : " + this.cc);
		System.out.println("color : " + this.color);
		System.out.println("price : " + this.price);
		System.out.println("maxSpeed : " + this.maxSpeed);
		System.out.println("speed : " + this.speed);
	}
}
