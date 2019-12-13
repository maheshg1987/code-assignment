package com.test;

import org.junit.Test;

import com.assignment.model.Duck;

public class DuckTest {
	
	@Test
	public void duckTest() {
		Duck duck = new Duck();
		duck.makeNoise();
		duck.swim();
	}

}
