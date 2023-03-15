package com.javalab.api.pkg03;

public class ToStringMain {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

		String strObj = myPhone.toString(); // toString()메소드 호출
		System.out.println(strObj);

		 //해당 클래스가 toString() 메소드 오버라이딩 하지 않았으면
		 //객체의 주소값이 나옴
		System.out.println(myPhone); // toString() 메소드 호출
	}

}
