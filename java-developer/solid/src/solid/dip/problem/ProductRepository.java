package solid.dip.problem;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

	private MySqlConnection mySqlConnection;
	
	public ProductRepository() {
		this.mySqlConnection = new MySqlConnection();
	}
	
	public List<Product> getProducts() {
		return new ArrayList<>();
	}
	
	public void saveProduct(Product product) {
		System.out.println("Produto salvo");
	}
}
