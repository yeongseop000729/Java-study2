package com.javalab.stream07;

public class Menu {
	
	private String name;
	private int calories;
	
	public Menu(String name, int calories) {
		super();
		this.name = name;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", calories=" + calories + "]";
	}
	
	
	

}
