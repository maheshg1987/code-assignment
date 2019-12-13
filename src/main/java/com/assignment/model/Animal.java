package com.assignment.model;

public abstract class Animal {

	public abstract void walk();

	public abstract void fly();

	public abstract void sing();
	
	public void swim() {
		System.out.println("can swim");
	}

}
