package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductSale implements Invoiceable{
	private List<ItensSale> itens;
	
	public ProductSale() {
		itens = new ArrayList<>();
		
	}
	
	public void addProduct(Product product) {
		int index = itens.indexOf(new ItensSale(product));
		if(index!= -1) {
			itens.get(index).addItem();
		}else {
			itens.add(new ItensSale(product));
		}
	}
	
	@Override
	public Double getTotalPrice() {
		Double result = 0.0;
		for (ItensSale itensSale : this.itens) {
			result += itensSale.getTotalPrice();
		}
		return result;
	}

	@Override
	public String invoiceableToString() {
		String result = "";
		for (ItensSale itensSale : itens) {
			result += itensSale.toString() + "\n";
		}
		return result;
	}
}
