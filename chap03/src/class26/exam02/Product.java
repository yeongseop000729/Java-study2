package class26.exam02;

public class Product {

	public int id;
	public String name;
	public int price;
	public int quantity;
	public int amount;

	public Product() {
		// System.out.println("여기는 기본 생성자입니다.");
	}

	public Product(int id, String name, int price, int quantity) {
		// System.out.println("여기는 오버로딩 생성자입니다.");
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getAmount() {
		return this.price * this.quantity;
	}

	// 생성된 객체의 정보를 보여주는 메소드[속성에 대한 기능]
	public void showProductInfo() {
		System.out.println("id : " + this.id);
		System.out.println("name : " + this.name);
		System.out.println("price : " + this.price);
		System.out.println("quantity : " + this.quantity);
		System.out.println("amount : " + this.getAmount());
	}
}
