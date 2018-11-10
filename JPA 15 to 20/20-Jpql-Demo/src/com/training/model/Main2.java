package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
	
		Query query=em.createNamedQuery("femaleFilterQuery");
		
		List<Person> persons=query.getResultList();
		for (Person person : persons) {
			System.out.println(person.getPersonId()+" "+person.getAge()+
					" "+person.getGender()+" "+person.getName()+" "+person.getSalary());
		}
		
		em.close();
		factory.close();
	}

}
