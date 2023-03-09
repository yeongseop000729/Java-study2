package com.javalab.class08;

public class ProductData {

	public Product[] products = new Product[10];

	public ProductData() {
		products[0] = new Product(1, "자전거", 250000);
		products[1] = new Product(2, "노트북", 1250000);
		products[2] = new Product(3, "쌀", 150000);
		products[3] = new Product(4, "세탁기", 800000);
		products[4] = new Product(5, "시금치", 2500);
		products[5] = new Product(6, "대파", 10000);
		products[6] = new Product(7, "에어컨", 3500000);
		products[7] = new Product(8, "쇼파", 3000000);
		products[8] = new Product(9, "우유", 2500);
		products[9] = new Product(10, "운동화", 600000);
	}

}
