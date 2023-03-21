package com.javalab.collection.pkg13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 저장할 ArrayList 객체 생성
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "자전거", 250000));
		productList.add(new Product(2, "노트북", 1250000));
		productList.add(new Product(3, "쌀", 150000));
		productList.add(new Product(4, "세탁기", 800000));
		productList.add(new Product(5, "시금치", 2500));
		productList.add(new Product(6, "대파", 10000));
		productList.add(new Product(7, "에어컨", 3500000));
		productList.add(new Product(8, "쇼파", 3000000));
		productList.add(new Product(9, "우유", 2500));
		productList.add(new Product(10, "운동화", 600000));

		// [문제.1] 전체 상품 목록 출력 메소드 호출(수동으로 메소드 시그너처 생성)
		System.out.println("1. 전체 상품 출력");
		printAllProduct(productList);
		System.out.println();
		System.out.println();

		// [문제.2] 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고
		// 해당 상품 가격을 main()메소드에서 출력하세요.
		System.out.println("2. 원하는 상품의 가격 검색");
		String wantedProduct = "";
		wantedProduct = "세탁기"; // 냉장고, 에어컨, 운동화 등 조회 가능
		int price = getProductPrice(productList, wantedProduct);
		System.out.println(wantedProduct + " 제품의 가격은 " + price + "원입니다.");
		System.out.println();
		System.out.println();

		// [문제.3] 구매한 제품의 평균 구매 가격을 조회해서 main 메소드에서 출력
		double avg = getAverage(productList);
		System.out.printf("3. 구매하신 제품의 평균 구매 가격은 %.2f 원입니다.\n", avg);
		System.out.println();
		System.out.println();

		// [문제.4] 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 호출
		List<Product> productList2 = product100List(productList);
		System.out.println("4. 제품 중에서 100만원이 넘는 제품");
		for (Product product : productList2) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}

		// HashMap 생성
		Map<Integer, Product> productMap = new HashMap<>();
		productMap.put(1, new Product(1, "자전거", 250000));
		productMap.put(2, new Product(2, "노트북", 1250000));
		productMap.put(3, new Product(3, "쌀", 150000));
		productMap.put(4, new Product(4, "세탁기", 800000));
		productMap.put(5, new Product(5, "시금치", 2500));
		productMap.put(6, new Product(6, "대파", 10000));
		productMap.put(7, new Product(7, "에어컨", 3500000));
		productMap.put(8, new Product(8, "쇼파", 3000000));
		productMap.put(9, new Product(9, "우유", 2500));
		productMap.put(10, new Product(10, "운동화", 600000));

		System.out.println();
		System.out.println("Map size : " + productMap.size());
		System.out.println();
		System.out.println();

		// [문제.5] HashMap을 통한 제품 출력
		System.out.println("[문제.5.1] 일반for문을 통한 HashMap 출력");
		printProductMap(productMap);
		System.out.println();
		System.out.println();

		System.out.println("[문제.5.2] while문과 Iterator를 통한 반복 출력");
		printProductMap2(productMap);

	}

	/**
	 * 
	 * @param productMap
	 */
	private static void printProductMap2(Map<Integer, Product> productMap) {
		Set<Integer> keySet = productMap.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(productMap.get(key).getId() + "\t" + productMap.get(key).getName() + "\t"
					+ productMap.get(key).getPrice());
		}

	}

	// HashMap을 통한 출력 메소드
	private static void printProductMap(Map<Integer, Product> productMap) {
		for (Integer key : productMap.keySet()) {
			System.out.println("key : " + productMap.get(key).getId() + "\t" + productMap.get(key).getName() + "\t"
					+ productMap.get(key).getPrice());
		}
	}

	/**
	 * 100만원이 넘는 고가 상품을 조회해서 ArrayList로 반환해주는 메소드
	 * 
	 * @param productList
	 * @return
	 */
	private static List<Product> product100List(List<Product> productList) {
		// 100만원이 넘는 제품을 담을 ArrayList 생성
		List<Product> productList2 = new ArrayList<Product>();
		for (Product product : productList) {
			if (product.getPrice() >= 1000000) {
				productList2.add(product);
			}
		}
		return productList2;
	}

	/**
	 * 전체 구매 제품들의 평균 구매 가격을 구해주는 메소드
	 * 
	 * @param productList
	 * @return
	 */
	private static double getAverage(List<Product> productList) {
		int sum = 0;
		for (Product product : productList) {
			sum += product.getPrice();
		}
		double avg = (sum * 1.0) / productList.size();
		return avg;
	}

	/**
	 * 제품의 가격을 찾아주는 메소드
	 * 
	 * @param productList
	 * @param wantedProduct
	 * @return
	 */
	private static int getProductPrice(List<Product> productList, String wantedProduct) {
		int price = 0; // 제품 가격 변수
		for (Product product : productList) {
			if (product.getName().equals(wantedProduct)) {
				price = product.getPrice();
			}
		}
		return price;
	}

	/**
	 * 전체 상품 목록 출력 메소드
	 * 
	 * @param productList
	 */
	private static void printAllProduct(List<Product> productList) {
		for (Product product : productList) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}

	}

}
