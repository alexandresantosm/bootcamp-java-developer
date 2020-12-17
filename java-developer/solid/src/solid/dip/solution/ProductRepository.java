package solid.dip.solution;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

	private DbConnection dbConnection;
	
	public ProductRepository(DbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public List<Product> getProducts() {
		return new ArrayList<>();
	}
	
	public void saveProduct(Product product) {
		System.out.println("Produto salvo");
	}
}
