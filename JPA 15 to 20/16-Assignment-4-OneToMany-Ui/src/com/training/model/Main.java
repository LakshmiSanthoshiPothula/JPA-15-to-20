package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		Loan loan=em.find(Loan.class,1);
		System.out.println(loan);
		System.out.println(loan.getList());
	}

}
