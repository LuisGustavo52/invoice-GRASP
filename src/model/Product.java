package model;

import java.util.Objects;

public class Product implements Sellable{
	private Double price;
	private String name;
	
	public Product(Double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	
	
}
