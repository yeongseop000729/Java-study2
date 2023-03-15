package com.javalab.api.pkg05;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		sb.append(" Ha Ha");
		System.out.println(sb); // prints "Hello World Ha Ha"
		System.out.println();

		// String 차이점
		String data = "ABC";
		data += "def";
		System.out.println(data); // ABCdef
	}

}
