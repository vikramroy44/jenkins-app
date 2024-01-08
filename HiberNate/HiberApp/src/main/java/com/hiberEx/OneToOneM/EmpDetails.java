package com.hiberEx.OneToOneM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class EmpDetails {
	@Id
	private int id;
	private String name;
	
	@OneToOne()
	private Address addrs;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	public EmpDetails(int id, String name, Address addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}
	
	
	public EmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
	
	
	

}
