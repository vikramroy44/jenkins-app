package com.handsonrestapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.StatusListenerAsList;

@RestController
public class ProductControler {
	
	@PostMapping("/saveproduct/")
	private String saveProduct(@RequestBody Product p) {
		// Logic to insert in data base
		System.out.println(p);
		return "Product Saved";
	}
	
	@GetMapping("/getproduct/{id}")
	private Product getProduct(@PathVariable int id) {
		
		//logic to fetch product from db
		Product p =null;
		
		if(id == 101) {
			p = new Product(101, "ABCD", 55.50);
		}
		else if(id ==102) {
			p = new Product(102, "MNOP", 155.05);
		}
		else {
			System.out.println("No Product Found");
		}
		return p;
	}
   
	@GetMapping("/getproducts")
	private List<Product> getAllProduct() {
		
		Product p1 = new Product(101, "ABCD", 55.50);
		Product p2 = new Product(102, "MNOP", 155.05);
		Product p3 = new Product(103, "PQRS", 355.85);
		List<Product> list = Arrays.asList(p1,p2,p3);
		return list;
		
	}
}
