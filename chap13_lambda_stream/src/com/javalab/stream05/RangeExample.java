package com.javalab.stream05;

import java.util.stream.IntStream;

/**
 * IntStream의 range(int a, int b) 메소드
 * - a부터 b까지의 int type 숫자 생성해줌
 */

public class RangeExample {

	public static void main(String[] args) {
		// 1 부터 10 까지의 정수를 만들어줌.
		IntStream.range(1, 11)
						.forEach(System.out::println);
		

	}

}
