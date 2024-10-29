package model;

import java.util.List;

public class Invoice {
	private Invoiceable invoiceable;
	private static int number;
	
	public Invoice(Invoiceable invoiceable) {
		this.invoiceable = invoiceable;
		number++;
	}

	public String getInvoice() {
		return String.format("----------------------------------\n"
				+ "Invoice number %d "
				+ "%s "
				+ "\n Valor Total: %.2f", number, invoiceable.invoiceableToString(),invoiceable.getTotalPrice());
	}
}
