package com.javalab.api.pkg05;

/**
 * 영문 (대소문자) 변환
 * toLowerCase = 소문자로 변환
 * toUpperCase = 대문자로 변환
 */

public class StringToLowerUpperCase {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // false
		
		String lowerStr1 = str1.toLowerCase(); 
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		// equalsIgnoreCase 대소문자 구분 없이 비교
		System.out.println(str1.equalsIgnoreCase(str2)); // true
	}
}
