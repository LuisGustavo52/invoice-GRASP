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

	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		try {
			Product other = (Product) obj;
			return Objects.equals(name, other.name);
		} catch (Exception e) {
			return false;
		}
	}

	
}
