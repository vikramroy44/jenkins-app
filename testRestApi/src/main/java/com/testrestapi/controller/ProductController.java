package com.testrestapi.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testrestapi.entity.Product;
import com.testrestapi.service.ProductSerImp;

import ch.qos.logback.core.status.StatusUtil;

@RestController
public class ProductController {
	
	@Autowired
	private ProductSerImp prserimp;
	
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product pr) {
		Product product = prserimp.saveProduct(pr);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}
	@GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product byId = prserimp.getProductById(id);
        return new ResponseEntity<Product>(byId, HttpStatus.OK);
    }
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> list = prserimp.getAllProduct();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String>  deleteById(@PathVariable int id){
		String product = prserimp.deleteProduct(id);
		return new ResponseEntity<String>(product, HttpStatus.OK);
		
	}
	
}
