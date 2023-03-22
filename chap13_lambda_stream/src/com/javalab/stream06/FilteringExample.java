package com.javalab.stream06;

import java.util.Arrays;
import java.util.List;

/**
 * 필터링
 * - filter() 특정 조건의 요소들만 선별
 */
public class FilteringExample {
	public static void main(String[] args) {
		// Arrays.asList : 리스트 타입으로 만들어줌
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
				
		);
		
		/**
		 * [필터링]
		 * 1. 남성 객체만 선별
		 * 2. 남성 객체의 나이로 IntStream 생성
		 * 
		 * IntStream에서 나이 평균 구함
		 * 평균을 Double 타입 자료형으로 구함
		 * OptionalDouble : double 값을 가지고 있는지 아닌지를 나타내는 컨테이너 클래스
		 * 값의 유무에 따라 추가 메소드가 제공됩니다.
		 */
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE) // 남성 객체로만 구성된 스트림 생성
				.mapToInt(Member :: getAge) // Member 객체를 나이로 매핑하는 IntStream 생성
				.average() // 요소들의 평균 나리 계산해서 OptionalDouble 타입의 하나의 값으로 산출
				.getAsDouble(); // OptionalDouble 타입에서 값을 꺼내는 역할
		
		System.out.println("남자 평균 나이 : " + ageAvg);
	}
}
