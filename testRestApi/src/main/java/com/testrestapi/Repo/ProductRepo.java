package com.testrestapi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testrestapi.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
