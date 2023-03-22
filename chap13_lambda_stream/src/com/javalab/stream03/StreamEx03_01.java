package com.javalab.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx03_01 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 90));
		list.add(new Student("신용권", 92));
		
		// IntStream 얻기 (int값만 들어있는 별도의 스트림)
		Stream<Student> studentStream = list.stream();
		// 중간 연산 메소드인 mapToInt
		//  - student 객체의 int type변수의 값만 모아서 IntStream 반환
		IntStream scoreStream = studentStream
							.mapToInt(student ->  student.getScore());
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균 점수는 : " + avg);

	}
}
