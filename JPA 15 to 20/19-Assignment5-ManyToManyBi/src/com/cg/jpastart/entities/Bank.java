package com.cg.jpastart.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="bank_master")
public class Bank {
	@Id
	@Column(name="bank_id")
	private int id;
	String name;
	String headOfficeLocation;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Bank_Customer", joinColumns = { @JoinColumn(name = "bank_id") }, inverseJoinColumns = { @JoinColumn(name = "customer_id") })
	List<Customer> customerList=new ArrayList<Customer>();
	public void addCustomer(Customer customer){
		this.customerList.add(customer);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadOfficeLocation() {
		return headOfficeLocation;
	}
	public void setHeadOfficeLocation(String headOfficeLocation) {
		this.headOfficeLocation = headOfficeLocation;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public Bank() {
		super();
	}
	public Bank(int id, String name, String headOfficeLocation) {
		super();
		this.id = id;
		this.name = name;
		this.headOfficeLocation = headOfficeLocation;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	

}
