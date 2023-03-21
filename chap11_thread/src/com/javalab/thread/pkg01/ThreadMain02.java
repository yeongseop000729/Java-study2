package com.javalab.thread.pkg01;

/**
 * [실행클래스] 스레드를 상속받은 자식 클래스 불필요 1. Thread를 상속한 별도의 자식 클래스를 파일로 만들지 않는다. 2. 즉석에서
 * Thread를 상속 받는 익명 자식 객체를 생성한다.
 */

public class ThreadMain02 {

	public static void main(String[] args) {
		/**
		 * [익명 자식 객체 생성] - Thread t1 = new Thread() {}; 위와 같이 하고 이클립스의 자동완성으로 run()메소드
		 * 오버라이딩 할것.
		 */
		Thread t1 = new Thread() {

			@Override
			public void run() {
				System.out.println("익명 자식 객체의 run()메소드 실행");
			}
		};
		t1.start();

	}

}
