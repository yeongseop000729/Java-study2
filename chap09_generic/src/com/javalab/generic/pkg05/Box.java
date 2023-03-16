package com.javalab.generic.pkg05;

/**
 * 제네릭 클래스
 * 
 * @param <T>
 */

public class Box<T> {

	// 필드
	private T t; // private Integer t;

	// Getter 메소드
	public T get() {
		return t;
	}

	// Setter 메소드
	public void set(T t) {
		this.t = t;
	}

}
