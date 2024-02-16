package com.handsonrestapi;

import java.util.Arrays;
import java.util.List;

import javax.naming.InvalidNameException;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handsonrestapi.GlobalExcecptionHandler.InvalidPriceException;

import ch.qos.logback.core.status.StatusListenerAsList;

@RestController
public class ProductControler {
	private static Logger logger = Logger.getLogger(ProductControler.class);
	@PostMapping("/saveproduct/")
	private String saveProduct(@RequestBody Product p) throws InvalidNameException, InvalidPriceException {
		// Logic to insert in data base6
		if( p.getName().equalsIgnoreCase("")) {
			//System.out.println(p.getName());
			logger.info(p);
			throw new InvalidNameException("Name is Required");
		}else if(p.getPrice()<5.00) {
			throw new InvalidPriceException("Not a valid Price");
		}
		else {
		System.out.println(p);
		}
		return "Product Saved";
		//p.getName().isEmpty()|| p.getName().isBlank() ||
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
