package com.test;

import org.junit.Test;

import com.assignment.model.Chicken;

public class ChickenTest {
	
	@Test
	public void testChicken() {
		
		Chicken chicken = new Chicken();
		chicken.makeNoise();
		chicken.fly();
	}

}
