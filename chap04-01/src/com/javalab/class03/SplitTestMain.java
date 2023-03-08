package com.javalab.class03;

/**
 * split(",") 메소드 : 콤머는 구분자
 */

public class SplitTestMain {

	public static void main(String[] args) {
		String csv = "홍길동;이규희;문소정;서규리;민중호";
		String[] arrTemp = csv.split(";"); // 문자열을 잘라서 배열 형태로 반환
		for (String st : arrTemp) {
			System.out.printf("%s ", st);
			
		}
	}

}
