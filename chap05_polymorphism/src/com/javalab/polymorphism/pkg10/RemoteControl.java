package com.javalab.polymorphism.pkg10;

/**
 * 인터페이스
 * - 인터페이스를 구현한 클래스에서 구현하도록 강제하는 메소드를 만들어놓음.
 */

public interface RemoteControl {
	
	/**
	 * 추상메소드(껍데기 메소드 : 내용부가 없음)
	 * 이 메소드는 구현 클래스(자식클래스)에서 반드시 코드를 작성해야 함.
	 * 메소드에는 보이지 않지만 public abstract이 생략됨
	 */
	public void turnOn();
	

}
