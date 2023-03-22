package com.javalab.stream08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 정렬(Sorting)
 */

public class SortingExample {

	public static void main(String[] args) {
		// int type 자료를 저장하는 IntStream 객체 생성
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		
		// IntStream 정렬
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		// ArrayList<Student>객체 생성
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 30),
				new Student("신용권", 10),
				new Student("유미선", 20)
			);
		
		// 학생의 점수를 기준으로 정렬
		List<Student> sortedList =
				studentList.stream() // Stream<Student> 객체 생성
				.sorted(Comparator.comparing(s -> s.getScore()))
				// .sorted(Comparator.comparing(Student::getScore)) // 위 문장과 동일
				.collect(Collectors.toList()); // 새로운 List를 만들어줌
		
		// 리스트 출력
		sortedList.forEach((s) -> System.out.println(s.toString()));
		// sortedList.forEach(System.out::println); // 위 문장과 동일
		
	    // IntStream 역정렬(내림차순 정렬)
	      IntStream intStream2 = IntStream.of(1, 5, 3, 2, 4);

	      IntStream sortedIntStream = intStream2
	              .boxed()
	              .sorted(Comparator.reverseOrder())
	              .mapToInt(Integer::intValue);

	      sortedIntStream.forEach(System.out::println);   
	}
}
