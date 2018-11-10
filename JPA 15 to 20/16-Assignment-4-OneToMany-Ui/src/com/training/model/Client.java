package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Loan loan=new Loan();
		loan.setCustomerName("santhu");
		loan.setLoanAmount(20000);
	    Repayment r1=new Repayment(1, 5000, 1);
	    Repayment r2=new Repayment(2, 5000, 2);
	    Repayment r3=new Repayment(3, 10000, 3);
	    
	    loan.addRepayment(r1);
	    loan.addRepayment(r2);
	    loan.addRepayment(r3);
	    
	    em.persist(loan);
System.out.println("Added loan along with three repayments to database.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();

	    
	    
	    
		
		
	}

}
