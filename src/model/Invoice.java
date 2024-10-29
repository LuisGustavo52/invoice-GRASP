package model;

import java.util.List;

public class Invoice {
	private Invoiceable invoiceable;

	public Invoice(Invoiceable invoiceable) {
		this.invoiceable = invoiceable;
	}

	public String getInvoice() {
		return String.format("%s%s%s%s", parte1, parte2, parte3, parte4);
	}
}
