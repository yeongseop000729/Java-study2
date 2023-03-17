package com.javalab.collection.pkg07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StdentCollectionMain {

	public static void main(String[] args) {

		// Data 생성
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);

		// 1. ArrayList
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);

		System.out.println("[문제.1] ArrayList로 출력하기 ");
		
		for (Student student : studentList) {
			System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getScore());
			// System.out.println(student.toString()); // 편한방법
		}
		System.out.println();

		// 2. HashSet(출력 순서 없음)
		Set<Student> studentSet = new HashSet<>(); // set도 인터페이스
		studentSet.add(stu1);
		studentSet.add(stu2);
		studentSet.add(stu3);
		studentSet.add(stu3); // 중복 (무시됨)
		
		System.out.println("[문제.2] HashSet으로 출력하기 ");
		
		for (Student student : studentSet) {
			System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getScore());
		}
		System.out.println();
		Iterator<Student> iter = studentSet.iterator();
		
		System.out.println("[문제.3] HashSet 반복문으로 출력하기 ");
		
		while (iter.hasNext()) {
			Student stu = iter.next();
			System.out.println(stu.getStudentId() + " " + stu.getName() + " " + stu.getScore());
		}
		System.out.println();

		// 3. HashMap<Key, Value>
		// <Key = Integer, Value = Student>
		Map<Integer, Student> map = new HashMap<>();

		// map에 학생 객체 저장(추가)
		map.put(stu1.getStudentId(), stu1);
		map.put(stu2.getStudentId(), stu2);
		map.put(stu3.getStudentId(), stu3);
		
		System.out.println("[문제.4] HashMap으로 출력하기");
		
		for (Integer key : map.keySet()) { // key를 담고 있는 Set반환[1, 2, 3]
			System.out.println(
					map.get(key).getStudentId() + " " + map.get(key).getName() + " " + map.get(key).getScore());
			//System.out.println(key + " " + map.get(key).toString());
		}
		System.out.println();

		Set<Integer> key = map.keySet(); // 1. 키만 선별해서 Set<K> 반환
		Iterator<Integer> sIter = key.iterator(); // 반복자 얻음
		
		System.out.println("[문제.5] HashMap 반목문으로 출력하기");
		
		while (sIter.hasNext()) {
			Integer k = sIter.next(); // key
					System.out.println(map.get(k).getStudentId() + " " + map.get(k).getName() + " " + map.get(k).getScore());
					//System.out.println(k+ " " + map.get(k).toString());
		}
	}
}
