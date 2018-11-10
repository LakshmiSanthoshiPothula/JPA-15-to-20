package com.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(
		{
		@NamedQuery(name="maleFilterQuery",
		            query="select p from Person p where p.gender='m'"),
		@NamedQuery(name="femaleFilterQuery",
		            query="select p from Person p where p.gender='f'"),
		@NamedQuery(name="SalaryFilterQuery",
	            query="select p from Person p where p.salary between 10000 and 50000")
		}
		
		)



public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
      private int personId;
      private String name;
      private int age;
      private double salary;
      private char gender;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Person(String name, int age, double salary, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	public Person() {
		super();
	}
      
      
	

}
