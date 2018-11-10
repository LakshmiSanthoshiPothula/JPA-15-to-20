package com.cg.jpastart.entities;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c1= new Customer(101, "sai", new Date());
        Customer c2 = new Customer(102, "siri", new Date());
        Customer c3 = new Customer(103, "siva", new Date());
        Customer c4 = new Customer(104, "sam", new Date());
        Customer c5 = new Customer(105, "anu", new Date());
        Customer c6 = new Customer(106, "puja", new Date());
        Customer c7 = new Customer(107, "santh", new Date());
        Customer c8 = new Customer(108, "bharu", new Date());
        Customer c9 = new Customer(109, "bhanu", new Date());
        Customer c10 = new Customer(110, "maggi", new Date());
        
        Bank b1 = new Bank(201, "icici", "chennai");
        b1.addCustomer(c1);
        b1.addCustomer(c2);
        b1.addCustomer(c3);
       
        c1.addBank(b1);
        c2.addBank(b1);
        c3.addBank(b1);
        
        
        Bank b2 = new Bank(202, "Kotak", "kolkata");
        b2.addCustomer(c3);
        b2.addCustomer(c6);
        b2.addCustomer(c2);
        b2.addCustomer(c4);
        b2.addCustomer(c8);
        
        
        c3.addBank(b2);
        c6.addBank(b2);
        c2.addBank(b2);
        c4.addBank(b2);
        c8.addBank(b2);
        
        Bank b3 = new Bank(203, "Indian", "Hyderabad");
        b3.addCustomer(c2);
        b3.addCustomer(c6);
        b3.addCustomer(c3);
        b3.addCustomer(c8);
        b3.addCustomer(c9);
        
        c2.addBank(b3);
        c6.addBank(b3);
        c3.addBank(b3);
        c8.addBank(b3);
        c9.addBank(b3);
        
        Bank b4 = new Bank(204, "Andhrabank", "vijayawada");
        b4.addCustomer(c5);
        b4.addCustomer(c6);
        b4.addCustomer(c7);
        b4.addCustomer(c4);
        b4.addCustomer(c10);
        
        c5.addBank(b4);
        c6.addBank(b4);
        c7.addBank(b4);
        c4.addBank(b4);
        c10.addBank(b4);
        
        Bank b5 = new Bank(205, "Statebank", "Delhi");
        b5.addCustomer(c10);
        b5.addCustomer(c6);
        b5.addCustomer(c3);
        b5.addCustomer(c4);
        b5.addCustomer(c8);
        
        c10.addBank(b5);
        c6.addBank(b5);
        c3.addBank(b5);
        c4.addBank(b5);
        c8.addBank(b5);
        
        em.persist(b1);
        em.persist(b2);
        em.persist(b3);
        em.persist(b4);
        em.persist(b5);
        
        
        System.out.println("Added bank along with customer details to database.");
        em.getTransaction().commit();
        em.close();
        factory.close();
        

	}

}
