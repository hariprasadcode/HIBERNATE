package org.dcl.newjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchUsinNative {
	public static void main(String[] args) {
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("dev");
		EntityManager man= fac.createEntityManager();
		Query q=man.createNativeQuery("select * from Merchant",Merchant.class);
		q.getResultList();
		
		
		
		
	}

}
