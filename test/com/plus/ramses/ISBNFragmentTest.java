package com.plus.ramses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ISBNFragmentTest {
	

	@Test
	public void testCheckSum(){
		
		ISBNFragment isbn = new ISBNFragment("014030128");
		assertEquals("should return correct ISBN", "0140301283", isbn.get10ISBN());	
	}
	
	@Test
	public void testCheckSumReturnsX(){
		
		ISBNFragment isbn = new ISBNFragment("031027107");
		assertEquals("should return correct ISBN", "031027107X", isbn.get10ISBN());	
	}

}
