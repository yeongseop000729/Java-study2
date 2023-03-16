package com.javalab.collection.pkg01;

import java.util.ArrayList;

public class ArrayList03 {
	
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		
		Person person1 = new Person("John", 25);
		Person person2 = new Person("Sarah", 30);
		
		people.add(person1);
		people.add(person2);
		
		people.add(new Person("Mike", 27));
		people.add(new Person("Jane", 18));
		
		
		// 향상된 for문
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getAge() + " years old.");
		}
		System.out.println();
		
		// 일반 for문
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).getName() + " " + people.get(i).getAge());
			
		}
			
		}
}

/**
 * Person 클래스
 * @return
 */

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}


