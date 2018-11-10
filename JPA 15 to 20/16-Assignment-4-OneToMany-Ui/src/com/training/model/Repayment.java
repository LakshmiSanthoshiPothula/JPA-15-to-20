package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="repay_amt")
public class Repayment {
	@Id
private int repaymentId;
private double repayAmount;
private int installmentNumber;
public int getRepaymentId() {
	return repaymentId;
}
public void setRepaymentId(int repaymentId) {
	this.repaymentId = repaymentId;
}
public double getRepayAmount() {
	return repayAmount;
}
public void setRepayAmount(double repayAmount) {
	this.repayAmount = repayAmount;
}
public int getInstallmentNumber() {
	return installmentNumber;
}
public Repayment() {
	super();
}
public Repayment(int repaymentId, double repayAmount, int installmentNumber) {
	super();
	this.repaymentId = repaymentId;
	this.repayAmount = repayAmount;
	this.installmentNumber = installmentNumber;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + repaymentId;
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
	Repayment other = (Repayment) obj;
	if (repaymentId != other.repaymentId)
		return false;
	return true;
}
@Override
public String toString() {
	return "Repayment [repaymentId=" + repaymentId + ", repayAmount="
			+ repayAmount + ", installmentNumber=" + installmentNumber + "]";
}
public void setInstallmentNumber(int installmentNumber) {
	this.installmentNumber = installmentNumber;
}
}
