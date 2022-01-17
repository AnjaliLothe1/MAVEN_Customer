package com.cdac.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Customer;

public class AddCustomer {

	public static void main(String[] args) {
		
		//Step1.create /obtain EntityManagerFactory Object
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-mysql");
		
		//Step2. Create/ EntityManager Object
		// Creating this object is similar to Statement/PerpaerdStatement objecy in JDBC
		//using which we will perform SQL Opertaions
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		//now we can insert/update/delete/slect whatever  we want 
		Customer c=new Customer();
		c.setName("Anjali Lothe");
		c.setEmail("lotheanjali502@gmail.com");
		c.setCity("Mumbai");
		em.persist(c);//persist method will generate insert query.
		
		tx.commit();
	}
}
