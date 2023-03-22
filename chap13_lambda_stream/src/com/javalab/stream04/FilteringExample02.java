package com.javalab.stream04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample02 {

	public static void main(String[] args) {
		List<String> names =
				Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
				.distinct() /* 중간 연산 : 중복을 제거하는 새로운 스트림 생성 */
				.filter(s -> s.equals("홍길동")) // 중간연산 - 반복적으로 적용 가능
				.forEach(n -> System.out.println(n)); // 최종연산 - 모든 요소를 소비
		System.out.println();
		
		names.stream()
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));

	}

}
