package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {
public static void main(String[] args) {
	String jpql="select p from Person p where p.salary between :StartRange and :EndRange";
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	Query query=em.createQuery(jpql);
	query.setParameter("StartRange", 10000.0);
	query.setParameter("EndRange", 50000.0);
	List<Person> persons=query.getResultList();
	for (Person person : persons) {
		System.out.println(person.getPersonId()+" "+person.getAge()+" "+person.getGender()+" "+person.getName()+" "+person.getSalary());
	}
	

	em.getTransaction().commit();
	em.close();
	factory.close();
}
}
