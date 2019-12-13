package com.test;

import org.junit.Test;

import com.assignment.model.Chicken;
import com.assignment.model.Rooster;

public class RoosterTest {
	
	@Test
	public void testRooster() {
		Chicken rooster = new Rooster();
		rooster.makeNoise();
		
	}

}
