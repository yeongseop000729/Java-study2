package com.javalab.api.pkg02;

public class PersonMain {

	public static void main(String[] args) {
		// Create a Person object with a String name
		Person<String> person1 = new Person<>("John", 30);
		System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());

		// Create a Person object with an Integer name
		Person<Integer> person2 = new Person<>(123, 25);
		System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());

		// Change the name of person1 to a different String
		person1.setName("Mike");
		System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
	}

}
