package com.assignment.model;

public class Bird extends Animal{
	
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");	
	}

	@Override
	public void sing() {
		System.out.println("I am singing");	
		
	}

}
