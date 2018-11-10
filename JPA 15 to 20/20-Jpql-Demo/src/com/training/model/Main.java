package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Person p1=new Person("santhu", 20, 20000, 'f');
		Person p2=new Person("sandy", 55, 600000, 'f');
		Person p3=new Person("puja", 20, 20000, 'f');
		Person p4=new Person("rahul", 55, 600000, 'm');
		Person p5=new Person("sanjay", 20, 20000, 'm');
		Person p6=new Person("vidya", 55, 600000, 'm');
		
		em.persist(p1);	
		em.persist(p2);
		em.persist(p3);	
		em.persist(p4);
		em.persist(p5);	
		em.persist(p6);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	     
		
	}
}
