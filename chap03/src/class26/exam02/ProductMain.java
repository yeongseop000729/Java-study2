package class26.exam02;

public class ProductMain {

	public static void main(String[] args) {

		// 첫번째 상품 객체 생성
		Product product = new Product();
		product.id = 202103001;
		product.name = "냉장고";
		product.price = 500;
		product.quantity = 5;

		// 첫번째 상품 객체 출력(조회)
		product.showProductInfo();
		System.out.println();

		// 두번째 상품 객체 생성
		Product product2 = new Product(202103002, "세탁기", 250, 5);
		// product2.id = 202103002;
		// product2.name = "세탁기";
		// product2.price = 250;
		// product2.quantity = -15; //잘못된 값을 객체의 필드에 직접 넣고있음
		// 두번째 상품 객체 출력(조회)
		product2.showProductInfo();

	}

}
