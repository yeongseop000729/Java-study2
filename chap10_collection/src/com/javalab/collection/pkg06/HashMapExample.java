package com.javalab.collection.pkg06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		// map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		// 키로 값 없기
		String key = "홍길동";
		int value = map.get(key); // 홍길동의 점수
		System.out.println(key + ": " + value);
		System.out.println();

		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet(); // 모든 키를 Set 컬렉션에 담아서 반환
		Iterator<String> keyIterator = keySet.iterator(); // KeySet.iterator() 반복자 리턴
		System.out.println("keyIterator.getClass().getSimpleName() : " + key);
		while (keyIterator.hasNext()) {
			String k = keyIterator.next(); // k의 type은 String(이름)
			Integer v = map.get(k); // 점수
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}
}
