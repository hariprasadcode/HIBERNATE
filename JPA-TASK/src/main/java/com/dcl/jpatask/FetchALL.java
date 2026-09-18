package com.dcl.jpatask;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchALL {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select c from Customer c");
		List<Customer>cl= q.getResultList();
		
		if(cl!=null) {
			for (Customer customer : cl) {
				
				System.out.println(customer);
			}
		}
		else {
			System.out.println("no customer found");
		}
	}

}
