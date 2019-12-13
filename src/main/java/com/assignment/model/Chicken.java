package com.assignment.model;

public class Chicken  extends Animal implements AnimalSound {

	public void makeNoise() {
		
		System.out.println("A chicken says: “Cluck, cluck”");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("chicken cannot fly");
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
