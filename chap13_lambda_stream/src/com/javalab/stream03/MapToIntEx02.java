package com.javalab.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림 반복문, mapToInt() 중간연산 메소드
 */

public class MapToIntEx02 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
				list.add(new Student("홍길동", 10));
				list.add(new Student("신용권", 20));
				list.add(new Student("유미선", 30));
				
				Stream<Student> studentStream = list.stream();
				
				// 중간 연산 메소드인 mapToInt
				// - student 객체의 int type변수의 값만 모아서 IntStream 반환
				IntStream scoreStream =
							studentStream
							.mapToInt(student -> student.getScore()); //mapToInt():int값만 모아진 IntStream 생성
				// .mapToInt(Student :: getScore)
				
				double avg = scoreStream
							.average() // IntStream에서 평균 구해주는 메소드
							.getAsDouble(); // 구해진 평균을 double타입으로 변환
				
				System.out.println("평균 점수는 : " + avg);
				
				double avg2 = list.stream()
						// [중간처리]학생 객체를 점수로 매핑해서 score를 요소로 갖는 새로운 스트림 생성
						// 그 스트림이 IntStream 이다.
						/* mapToInt는 함수형 인터페이스인 ToIntFunction타입을 매개변수로 갖고 IntStream을 리턴해줌 */
						.mapToInt(student -> student.getScore()) // IntStream 객체 생성
						//.mapToInt(Student :: getScore)
						// 최종 처리 (평균 점수)
						.average() // IntStream에 들어있는 숫자들의 평균을 계산해줌.
						.getAsDouble(); // 평균을 Double 타입으로 얻어줌.

	}

}
