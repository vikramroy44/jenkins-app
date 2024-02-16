package com.test.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.crud.Service.EmpService;
import com.test.crud.model.EmpTest;

@RestController
public class TestController {
   
	@Autowired
	private EmpService empservice;
	
	@GetMapping("/test")
	public String test() {
		return "Controller Invoked";
	}
	@PostMapping("/emp")
	public ResponseEntity<EmpTest> createEmp(@RequestBody EmpTest emp){
			    EmpTest empSaved = empservice.upsert(emp);
			    return new ResponseEntity<>(empSaved, HttpStatus.CREATED);
		}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<EmpTest> getEmp(@PathVariable Integer id){
		EmpTest empData = empservice.getEmpById(id);
		return new ResponseEntity<>(empData, HttpStatus.OK);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<EmpTest>> getAllEmp(){
		List<EmpTest> allEmp = empservice.getAllEmp();
		return new ResponseEntity<>(allEmp, HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<String> delteEmp(@PathVariable Integer id){
		String str = empservice.deleteEmp(id);
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
	@PutMapping("/emp")
	public ResponseEntity<EmpTest> updateEmp(@RequestBody EmpTest emp){
		EmpTest updatedEmp = empservice.upsert(emp);
		return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
	}
		
	}

