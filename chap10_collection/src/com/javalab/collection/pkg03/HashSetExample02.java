package com.javalab.collection.pkg03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 1. HashSet 사용에제 - Set < Collection < Iterable 구현 
 * - 순서가 없고 중복을 허용하지 않음. 
 * 2.반복자(iterator)를 얻어서 출력가능하면 
 * - 향상된 for문으로도 출력가능
 */

public class HashSetExample02 {
	public static void main(String[] args) {

		// 새로운 HashSet 컬렉션 객체 생성
		// 타입 파라미터로 String을 줌
		HashSet<String> names = new HashSet<>();

		// HashSet에 요소 추가
		names.add("Alice");
		names.add("Bob");
		names.add("Jack");
		names.add("David");

		// 중복된 값을 넣어보지만 무시됨
		names.add("Alice");

		// 이름 출력
		System.out.println("이름: " + names); // 이름: [Bob, Alice, David, Jack]
		System.out.println();

		// Jac이름이 있는지 Check
		if (names.contains("Jack")) {
			System.out.println("HashSet 안에 Jack이 있습니다.");
		}
		System.out.println();

		// Bob 제거
		names.remove("Bob");

		// 다시 출력
		System.out.println("Bob 삭제후 : " + names); // Bob 삭제후 : [Alice, David, Jack]
		System.out.println();

		// 사이즈
		System.out.println("Size of the HashSet: " + names.size());
		System.out.println();

		// HashSet으로부터 반복자 얻기
		Iterator<String> iterator = names.iterator();

		// 각 요소를 출력하기 위해서 반복자(iterator) 사용
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("Hello, " + name + "!");
		}
		
		// 특정 컬렉션의 이름이 어떻게 되는지 확인할 떄
		System.out.println("컬렉션의 이름 확인");
		System.out.println(names.getClass().getSimpleName());
		System.out.println();
		
		// 반복자를 통하지 않고 향상된 for문으로 출력 가능.
		System.out.println("향상된 for문을 출력");
		for (String string : names) {
			System.out.println(string);
		}
	}
}
