package com.test;

import org.junit.Test;

import com.assignment.model.Bird;


public class AnimalTest {
	
	@Test
	public void AnimalTest() {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	}

}
