package com.testrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testrestapi.Repo.ProductRepo;
import com.testrestapi.entity.Product;

@Service
public class ProductSerImp implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product saveProduct(Product pr) {
		// TODO Auto-generated method stub
		Product product = productRepo.save(pr);
		return product;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> findById = productRepo.findById(id);
		if(findById.isPresent())
			return findById.get();
		System.out.println("No Data Found for ID:" + id);
		return null;
	}

	@Override
	public Product updateProduct(Product pr) {
		// TODO Auto-generated method stub
		return productRepo.save(pr);
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> findAll = productRepo.findAll();
		return findAll;
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		if(productRepo.existsById(id)) {
		   productRepo.deleteById(id);
		   return "Product Deleted";
		   }else {
		    return "No Record Present";
		   }
	}

}
