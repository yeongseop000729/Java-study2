package com.javalab.polymorphism.pkg19;

// 중첩 인터페이스를 테스트할 실행클래스
public class ButtonMain {

	public static void main(String[] args) {

		// Ok 버튼 객체 생성
		Button2 btnOk = new Button2();

		// [중첩클래스]Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class OkListener implements Button2.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다."); // 코드 구현
			}
		}

		// Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());

		// Ok 버튼 클릭하기
		btnOk.click();

		// Cancle 버튼 객체 생성
		Button2 btnCancle = new Button2();

		// Cancle 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CanceListener implements Button2.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}

		// Cancle 버튼 객체에 ClickListener 구현 객체 주입
		btnCancle.setClickListener(new CanceListener());

		// Cancle 버튼 클릭하기
		btnCancle.click();
	}

}
