package com.test.crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crud.Repo.MyRepository;
import com.test.crud.model.EmpTest;

@Service
public class EmpService implements EmpServiceIntf {

	@Autowired
	 private MyRepository emprepo;
	
	@Override
	public EmpTest upsert(EmpTest emp) {
		// TODO Auto-generated method stub
		EmpTest save = this.emprepo.save(emp);
		return save;
	}

	@Override
	public List<EmpTest> getAllEmp() {
		// TODO Auto-generated method stub
		return this.emprepo.findAll();
		
	}

	@Override
	public EmpTest getEmpById(Integer id) {
		// TODO Auto-generated method stub
		
		 Optional<EmpTest> emp =  this.emprepo.findById(id);
		 if(emp.isPresent()) {
			 return emp.get();
		 }else {
			 return null;
		 }
		
	}

	@Override
	public String deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		boolean existsById = this.emprepo.existsById(id);
		if(existsById) {
			emprepo.deleteById(id);
			return "Delete Success";
		}else {
		return "Record Not Found";
		}
	}

}
