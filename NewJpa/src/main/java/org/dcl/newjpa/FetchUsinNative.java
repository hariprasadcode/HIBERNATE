package org.dcl.newjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchUsinNative {
	public static void main(String[] args) {
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("dev");
		EntityManager man= fac.createEntityManager();
		Query q=man.createNativeQuery("select * from Merchant",Merchant.class);
		List<Merchant>ml=q.getResultList();
		if(!ml.isEmpty()) {
			for (Merchant merchant : ml) {
				System.out.println(merchant);
			}
		}
		else {
			System.out.println("not found");
		}
		
		
		
		
		
	}

}
