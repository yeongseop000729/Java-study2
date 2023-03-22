package com.javalab.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/*
 * 스트림 반복문
 */
public class StremaEx03 {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 90));
		list.add(new Student("신용권", 92));
		
		// [1] 향상된 for문
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println();
		
		// [2] 스트림 : interface Stream<T>
		// forEach()는 학습형 인터페이스의 Consumer를 매개변수로 갖음
		Stream<Student> stream = list.stream(); // 스트림 객체 변환
		stream.forEach(s -> { /* s는 list에 들어 있는 Student 객체들 */
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score + "점");
		});
		
		System.out.println();
		
		// [3] 스트림 참조 변수 없이 바로 forEach()메소드 호출
		list.stream().forEach(Student -> {
			System.out.println(Student.toString());
		});
	}

}
