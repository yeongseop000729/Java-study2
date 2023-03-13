package com.javalab.polymorphism.pkg09;

/**
 * 구현 클래스
 * - 추상클래스를 상속받아서 부모가 가지고 있는 추상 메소드를 구현한 클래스
 */

public class Baseball extends Sports {
	
	@Override
	public void play(Sports sports) { // 매개 변수 다형성 구현 용도
		System.out.println(sports.toString() + "경기를 합니다.");
	}
	
	public String toString() {
		return "야구";
	}

}
