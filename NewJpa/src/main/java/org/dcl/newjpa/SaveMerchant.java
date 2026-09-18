package org.dcl.newjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMerchant {
	public static void main(String[] args) {
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("dev");
		EntityManager man=fac.createEntityManager();
		EntityTransaction tran= man.getTransaction();
		
		tran.begin();
		Merchant m= new Merchant();
		m.setName("Ashok");
		m.setEmail("ashok@gmail.com");
		m.setGst_num("123ABC");
		m.setPhone(99887766551l);
		m.setPassword("anitha123");
		man.persist(m);
		tran.commit();
		
	}

}
