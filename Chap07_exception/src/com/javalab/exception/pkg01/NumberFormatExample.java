package com.javalab.exception.pkg01;

public class NumberFormatExample {

	public static void main(String[] args) {

		String strNum = "20o";
		int intNum = Integer.parseInt(strNum);
		System.out.println(strNum + " " + intNum);

	}

}
