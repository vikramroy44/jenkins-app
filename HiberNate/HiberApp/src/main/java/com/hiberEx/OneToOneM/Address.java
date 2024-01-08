package com.hiberEx.OneToOneM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Address {
	
	@Id
	private int addId;
	private String addrs;
	
	
	 @OneToOne(mappedBy = "addrs")
	 private EmpDetails empDetails;
	 
	 
	public EmpDetails getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(EmpDetails empDetails) {
		this.empDetails = empDetails;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	public Address(int addId, String addrs, EmpDetails empDetails) {
		super();
		this.addId = addId;
		this.addrs = addrs;
		this.empDetails = empDetails;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addrs=" + addrs + "]";
	}
	
	
	
	
	

}
