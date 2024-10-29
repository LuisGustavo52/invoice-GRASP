package model;

import java.util.Objects;

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
	
	@Override
	public String toString() {
		String intemStr = String.format("%s %d %.2f",
				this.sellable.getName(),
				this.amount,
				this.getTotalPrice());
		
		return intemStr;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		try {
			ItensSale other = (ItensSale) obj;
			return Objects.equals(this.sellable.getName(), other.sellable.getName());
		} catch (Exception e) {
			return false;
		}
	}

}
