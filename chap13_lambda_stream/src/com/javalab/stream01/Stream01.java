package com.javalab.stream01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김자가");
		set.add("정명훈");
		set.add("김채훈");
		
		Stream<String> stream = set.stream();
		stream.forEach(na -> System.out.println(na));
		

	}

}
