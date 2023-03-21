package com.javalab.collection.pkg13;

public class Product {

	// 필드 : 접근제한자가 모두 private
	private int id;
	private String name;
	private int price;

	// 기본생성자(파라미터, 내용부 없음)
	public Product() {
	}

	// 오버로딩 생성자
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//// getter/setter public 메소드(이클립스로 자동생성)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0)
			this.price = 0;
		this.price = price;
	}

	// 객체 내부의 값조회(출력)
	// public String showProductInfo() {
//	      return this.id + " " + this.name + " " + this.price;
	// }
	//
	// @Override
	// public String toString() {
//	      return this.id + "\t" + this.name + "\t" + this.price;
	// }

}
