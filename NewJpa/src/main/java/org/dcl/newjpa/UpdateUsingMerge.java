package org.dcl.newjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUsingMerge {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tran= em.getTransaction();
		tran.begin();
		Merchant m= new Merchant();
		m.setId(2);
		m.setName("Asha");
		m.setEmail("asha@gmail.com");
		m.setPhone(8147277756l);
		m.setGst_num("PQR123");
		m.setPassword("shridhar123");
		
		em.merge(m);
		tran.commit();
		em.close();
	}

}
