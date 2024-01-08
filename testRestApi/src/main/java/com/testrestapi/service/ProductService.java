package com.testrestapi.service;

import java.util.List;

import com.testrestapi.entity.Product;

public interface ProductService {
	Product saveProduct(Product pr);
	
	Product getProductById(int id);
	
	Product updateProduct(Product pr);
	
	List<Product> getAllProduct();
	
	String deleteProduct(int id);

}
