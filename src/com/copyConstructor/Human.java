package com.copyConstructor;

public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//this is copy constructor
	public Human(Human human) {
//	this(human.getName(),human.getAge());
		
		name = human.getName();
		age = human.getAge();
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
