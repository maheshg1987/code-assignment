package com.test;

import org.junit.Test;

import com.assignment.model.Animal;
import com.assignment.model.Bird;


public class AnimalTest {
	
	@Test
	public void AnimalTest() {
		Animal bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
