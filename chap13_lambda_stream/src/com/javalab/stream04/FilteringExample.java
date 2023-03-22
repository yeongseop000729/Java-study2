package com.javalab.stream04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringExample {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
		);
		
		/*
		 * [filter 메소드]
		 * - Stream<T> filter(함수형 인터페이스인 Predicate<? super T>를
		 * 		매개변수로 갖음)
		 * - 새로운 스트림을 반환함.
		 * [collect 메소드]
		 * - <R, A> R collect(Collector<? super T, A, R> var1);
		 */
		// [1] 필터링을 적용하여 조건에 맞는 객체만 선별해서 List<Member>로 생성
		List<Member> developerList = list.stream()
				// 잡이 개발자인 객체만 걸러서 새로운 스트림 생성
				.filter(m -> m.getJob().equals("개발자"))
				// 필터로 걸러진 스트림의 요소들을 List 컬렉션에 모아줌.
				.collect(Collectors.toList());
		
		// [2] List를 스트림으로 만들어서 반복
		developerList.stream()
							.forEach(m -> System.out.println(m.getName()));
		System.out.println();
		
		// [1] 과 [2]를 한번에 처리
		list.stream().filter(member -> member.getJob().equals("개발자"))
							.collect(Collectors.toList())
							.forEach(m -> System.out.println(m));
	}

}
