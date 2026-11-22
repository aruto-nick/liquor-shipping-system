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
	
	//Setterテストのためインスタンス生成
	Product p2 = new Product ("ビール", 600, 15);
	
	@Test
	void testSetName() {
		p2.setName("日本酒");
		assertEquals("日本酒", p2.getName());
	}
	
	@Test
	void testSetPrice() {
		p2.setPrice(800);
		assertEquals(800, p2.getPrice());
	}
	
	@Test
	void testSetStock() {
		p2.setStock(30);
		assertEquals(30, p2.getStock());
	}

}
