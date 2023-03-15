package com.javalab.api.pkg01;

/**
 * 제네릭 클래스 
 * - 객체가 생성될 시점에 타입(클래스)를 받아들이고 그 클래스 타입으로 본 클래스 내부가 구성
 * - <T> 타입 파라미터 : 본 객체가 생성될 떄 전달되는 클래스의 타입
 * 
 * @param <T>
 */

public class Box<T> {
	public T content;
}
