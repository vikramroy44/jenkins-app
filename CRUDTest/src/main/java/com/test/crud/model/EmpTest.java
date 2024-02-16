package com.test.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String name;
	private String department;
	private double salary;
	
	
}
