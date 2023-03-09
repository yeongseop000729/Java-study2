package com.javalab.class08;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData(); // Product 객체 10개 담을 수 있는 배열
		Product[] products = pd.products;

		// [문제.1] 전체 상품 목록 출력
		printProduct(products);

		// [문제.2] 세탁기의 가격을 조회하시오.
		String tempStr = "세탁기"; // String (tempStr는 변수) = ""; tempStr를 사용하는 이유는 값을 저장하려고
		getWashPrice(tempStr, products); // 이름뒤에 () 있으면 메소드

		// [문제.3] 구매한 모든 제품의 총액과 평균 가격을 main메소드에서 출력하세요.

		// [문제 .3] 구매한 모든 제품의 총액 main 메소드 출력
		int sum = getTotalAmount(products);
		double avg = getAvg(products);
		 System.out.printf("구매하신 제품의 총액은 %d 원이며 평균 구매 가격은 %.2f 원입니다.\n", sum, avg);
	      System.out.println("");

		
		// [문제.4] 제품 중에서 100만원 이상 제품의 목록, 수량, 합계 금액 출력
		getProductGrather100(products);

	} // end main
	

	// [문제.1] 전체 상품 목록 출력
	private static void printProduct(Product[] products) {
		for (Product product : products) {
		//        타입변수          :   배열
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());

		}
		System.out.println();
	}

	// [문제.2] 세탁기의 가격을 조회하시오.
	private static void getWashPrice(String tempStr, Product[] products) {
	                              // String tempStr = "세탁기";
		int tempPrice = 0;
		for (Product p : products) {
			if (p.getName().equals(tempStr)) {
				tempPrice = p.getPrice();
			}			
		}
		System.out.println("2." + tempStr + " 가격은 " + tempPrice + " 입니다.");
		System.out.println();
	}

	// [문제.3] 구매한 모든 제품의 총액을 main메소드에서 출력하세요.
	private static int getTotalAmount(Product[] pds) { // 파라미터를 받아서 여기서 작업하기위해 받음
		int sum = 0;
		// int타입으로 변수선언
		for (int i = 0; i < pds.length; i++) { // int i = 0; = for문안에서 변수 선언후 초기화
			sum = sum + pds[i].getPrice();	
		}
		return sum;
	}

	// [문제.3] 구매한 모든 제품의 평균 가격을 main메소드에서 출력하세요.
	private static double getAvg(Product[] pds) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < pds.length; i++) {
			sum = sum + pds[i].getPrice();
		}
		avg = (sum * 1.0) / pds.length;
		return avg;
	}

	//[문제.4] 제품 중에서 100만원 이상 제품의 목록, 수량, 합계 금액
	private static void getProductGrather100(Product[] pds) {
		int sum = 0;
		int count = 0;
		System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다.\n");
		for (int i = 0; i < pds.length; i++) {
			if (pds[i].getPrice() >= 1000000) {
				System.out.println("--------------------------------------");
				System.out.println(pds[i].getId() + "\t" + pds[i].getName() + "\t" + pds[i].getPrice());
				sum += pds[i].getPrice();
				count++;
			}
		
	}
		System.out.println("100만원 이상인 제품의 수량은 : " + count + "개 이며 합계는 " + sum + "입니다.");
		
	}
}
