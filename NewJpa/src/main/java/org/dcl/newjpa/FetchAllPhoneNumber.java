package org.dcl.newjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllPhoneNumber {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select m.phone from Merchant m ");
		List<Long>l=q.getResultList();
		if(l.size()>0) {
			
			for(Long ph:l) {
				System.out.println(ph);
			}
		}
		else {
			System.out.println("No Phone Number Present");
		}
	}

}
