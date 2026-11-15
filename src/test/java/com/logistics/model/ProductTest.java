package com.logistics.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductTest {
	
	@Test
	void testGetName() {
		Product p1 = new Product("ビール",500,10);
		
		assertEquals("ビール", p1.getName());
	}
	
	@Test
	void testGetPrice() {
		Product p1 = new Product("ビール",500,10);
		
		assertEquals(500, p1.getPrice());
	}
	
	@Test
	void testGetStock() {
		Product p1 = new Product("ビール",500,10);
		
		assertEquals(10, p1.getStock());
	}

}
