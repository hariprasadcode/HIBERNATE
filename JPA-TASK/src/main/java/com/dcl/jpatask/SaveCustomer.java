package com.dcl.jpatask;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCustomer {
	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tran= em.getTransaction();
		
		tran.begin();
		Customer c= new Customer();
		c.setName("HariPrasad");
		c.setEmail("hariprasad@gmail.com");
		c.setPassword("hari123");
		c.setPhone(8147277756l);
		
		em.persist(c);
		tran.commit();
	   
	}

}
