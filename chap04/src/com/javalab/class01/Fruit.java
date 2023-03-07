package com.javalab.class01;

/**
 * 과일 클래스
 * 필드 (멤버변수, 인스턴스변수)
 * - String name
 * - int price
 * - int quantity
 */
public class Fruit {
	
	// 필드 선언
	
	private String name;
	private int price;
	private int quantity;
	
	// 기본 생성자
	// 기본 생성자가 하는일은 기본값 초기화
	// 필드 초기화
	public Fruit() {
	}
	
	// 오버로딩 생성자
	// 오버로딩 생성자 하는일은 여러개 초기화
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 메소드 값을 가져올떄 , 값을 저장할떄 사용 하는 메소드
	// setter = 이상한 값 들어가지않게
	public String getName() {
		// 문자열 반환
		return this.name;
	}
	
	// String name -> name -> this.name 으로 준다
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
