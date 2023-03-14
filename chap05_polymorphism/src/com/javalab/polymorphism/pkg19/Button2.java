package com.javalab.polymorphism.pkg19;

/**
 * 중첩 인터페이스
 */

public class Button2 {

	// 정적 멤버 인터페이스 [중첩인터페이스]
	public static interface ClickListener {

		// 추상 메소드
		void onClick();
	}

	// 필드
	private ClickListener clickListener;

	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	// 메소드
	public void click() {
		this.clickListener.onClick(); // 버튼 클릭시 실행하는 메소드
	}
}
