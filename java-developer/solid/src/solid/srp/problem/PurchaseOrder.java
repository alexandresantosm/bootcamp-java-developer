package solid.srp.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<PurchaseOrder> findPurchaseOrder() {
		//retornar a lista de ordens de compra da base de dados
		return new ArrayList<>();
	}
	
	public void savePurchaseOrder() {
		//salvar lista de produtos na base de dados
	}
	
	public void sendEmail(String email) {
		//enviar e-mail da ordem de servico
	}
	
	public void printPurchaseOrder() {
		//imprimir a ordem de servico
	}
}
