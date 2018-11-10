package com.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Loan")
public class Loan {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int loanId;
private String customerName;
private double loanAmount;
@OneToMany(cascade=CascadeType.ALL)
private List<Repayment> list=new ArrayList<Repayment>();
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
public List<Repayment> getList() {
	return list;
}
public void setList(List<Repayment> list) {
	this.list = list;
}
@Override
public String toString() {
	return "Loan [loanId=" + loanId + ", customerName=" + customerName
			+ ", loanAmount=" + loanAmount + ", list=" + list + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + loanId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Loan other = (Loan) obj;
	if (loanId != other.loanId)
		return false;
	return true;
}
public void addRepayment(Repayment rp){
	this.list.add(rp);
}

}
