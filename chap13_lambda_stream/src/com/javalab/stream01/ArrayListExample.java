package com.javalab.stream01;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("체리");
		myList.add("오렌지");
		
		myList.stream().forEach(name -> System.out.println(name));
	}
}
