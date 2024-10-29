package view;

import model.Invoice;
import model.Invoiceable;
import model.Product;
import model.ProductSale;

public class PrintInvoice {

	public static void main(String[] args) {
		Product rice = new Product(33.45, "Arroz Santa Amália");
		Product beans= new Product(12.4, "Feijão juliando");
		Product pasta = new Product(33.1, "Macarrão Santa Amália");
		
		
		ProductSale venda1 = new ProductSale();
		venda1.addProduct(pasta);
		
		venda1.addProduct(rice);
		venda1.addProduct(rice);
		venda1.addProduct(rice);

		venda1.addProduct(beans);
		venda1.addProduct(beans);
		venda1.addProduct(beans);
		venda1.addProduct(beans);
		venda1.addProduct(beans);
		venda1.addProduct(beans);
		
		Invoice invoice1 = new Invoice(venda1);
		System.out.println(invoice1.getInvoice());
	}

}
