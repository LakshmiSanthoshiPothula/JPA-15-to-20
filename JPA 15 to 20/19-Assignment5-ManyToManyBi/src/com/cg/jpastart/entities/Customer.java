package com.cg.jpastart.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="customer_master")
public class Customer {
     @Id
     @Column(name="customer_id")
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	@Column(name = "cust_date")
	private Date dob;

	public Customer() {
		super();
	}
	public Customer(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="customerList")
	List<Bank> bankList=new ArrayList<Bank>();
	public void addBank(Bank bank){
		this.bankList.add(bank);
		
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<Bank> getBankList() {
		return bankList;
	}
	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}
}
