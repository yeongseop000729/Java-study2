package com.javalab.stream03;

import java.util.Arrays;
import java.util.List;

public class MapToInt01 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10), 
				new Student("신용권", 20),
				new Student("유미선", 30)
				);

		studentList.stream() // Stream<Student> 객체 생성
				//.mapToInt((Student s)->s.getScore()) // 학생의 점수로만 된 IntStream 생성
				.mapToInt(Student :: getScore) // 학생의 점수로만 된 IntStream 생성
				.forEach(score -> System.out.println(score));
	}

}
