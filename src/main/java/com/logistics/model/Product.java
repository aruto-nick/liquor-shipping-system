package com.logistics.model;

public class Product {
	
	//商品名・価格・在庫数を保持するフィールド
	private String name;
	private int price;
	private int stock;

	//コンストラクタ
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public static void main (String[] args) {
		Product p1 = new Product("ビール", 500, 10);
		System.out.println(p1.name + p1.price +"円の残り在庫数は" + p1.stock);
	}

}