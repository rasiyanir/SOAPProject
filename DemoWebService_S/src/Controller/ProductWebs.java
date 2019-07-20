package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductWebs {

	public Product getProduct() {
		return new Product(1, "Product1", 500);
	}
	
	public List<Product> getAllProducts() throws IOException{
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Product1", 500));
		productList.add(new Product(2, "Product2", 1500));
		productList.add(new Product(3, "Product3", 2500));
		return productList;
	}
	
}
