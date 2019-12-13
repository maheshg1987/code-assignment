package com.test;

import org.junit.Test;

import com.assignment.model.Sharks;

public class SharksTest {
	
	@Test
	public void testShark() {
		Sharks sharks = new Sharks();
		sharks.setSize("large");
		sharks.setColour("gray");
		
		System.out.println("sharks" +" " +sharks.getSize() +" "+"and"+" "+ sharks.getColour());
	}

}
