package com.test.crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.crud.model.EmpTest;

public interface MyRepository  extends JpaRepository<EmpTest, Integer>{
	
}