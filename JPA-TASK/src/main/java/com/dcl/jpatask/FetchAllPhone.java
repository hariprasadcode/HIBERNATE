package com.dcl.jpatask;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select c.phone from Customer c");
		List<Long>lp=q.getResultList();
		if(lp.size()>0) {
			for (Long long1 : lp) {
				System.out.println(long1);
			}
		}
		else {
			System.out.println("no phone number");
		}
	}

}
