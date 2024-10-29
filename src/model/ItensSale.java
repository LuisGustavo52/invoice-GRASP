package model;

public class ItensSale {
	private Sellable sellable;
	private int amount;
	
	public ItensSale(Sellable sellable) {
		amount = 1;
		this.sellable = sellable;
	}

	public Double getTotalPrice(){
		return sellable.getPrice() * amount;
	}
	
	public void addItem() {
		amount++;
	}
}
