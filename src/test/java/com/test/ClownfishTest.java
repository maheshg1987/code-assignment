package com.test;

import org.junit.Test;

import com.assignment.model.Clownfish;

public class ClownfishTest {
	
	@Test
	public void testClownfish() {
		
		Clownfish Clownfish = new Clownfish();
		
		Clownfish.setMakeJokes(true);
		Clownfish.setColour("orange");
		Clownfish.setSize("small");
		
	}

}
