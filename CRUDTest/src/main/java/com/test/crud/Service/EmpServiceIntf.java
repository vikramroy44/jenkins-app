package com.test.crud.Service;

import java.util.List;

import com.test.crud.model.EmpTest;

public interface EmpServiceIntf {
   public EmpTest upsert(EmpTest emp);
   
   public List<EmpTest> getAllEmp();
   
   public EmpTest  getEmpById(Integer id);
   
   public String deleteEmp(Integer id);
   
}
