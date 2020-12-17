package solid.srp.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import solid.srp.problem.Product;

public class PurchaseOrder {

private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public BigDecimal calculateTotal() {
		return products.stream().map(Product::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}
