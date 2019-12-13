package com.test;

import org.junit.Test;

import com.assignment.model.Animal;
import com.assignment.model.Fish;

public class FishTest {
	
	@Test
	public void testFish() {
		Animal fish  = new Fish();
		fish.sing();
		fish.walk();
		fish.swim();
	}

}
