package com.dcl.jpatask;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchCustomerNameAndPhone {
	
	public static void main(String[] args) {
		 
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q= em.createQuery("select c.name,c.phone from Customer c");
		List<Object[]>cl= q.getResultList();
		if(cl!=null) {
			for (Object[] customer : cl) {
				System.out.println(customer[0] + "  "+customer[1]);
			}
		}
		else {
			System.out.println("not found ");
		}
		
	}

}
