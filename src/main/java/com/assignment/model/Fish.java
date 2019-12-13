package com.assignment.model;

public class Fish extends Animal{

	@Override
	public void walk() {
		
		System.out.println("Fishes don’t walk");
	}

	@Override
	public void fly() {
		
		
	}

	@Override
	public void sing() {
		System.out.println("Fishes don’t sing");
		
	}

}
