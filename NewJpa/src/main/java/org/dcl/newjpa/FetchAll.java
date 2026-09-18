package org.dcl.newjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("dev");
		EntityManager man=fac.createEntityManager();
		Query q= man.createNamedQuery("fetch");
		List<Merchant>ml= q.getResultList();
		if(!ml.isEmpty()) {
			for (Merchant merchant : ml) {
				System.out.println(merchant);
			}
		}
		else {
			System.out.println("Not fond");
		}
		
	}

}
