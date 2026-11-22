package com.logistics.model;

import java.util.ArrayList;

public class ProductManager {

	private ArrayList<Product> products;
	
	public ProductManager() {
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
}
