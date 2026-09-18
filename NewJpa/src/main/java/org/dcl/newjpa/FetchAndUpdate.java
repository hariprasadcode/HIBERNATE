package org.dcl.newjpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchAndUpdate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id : ");
		int mid=sc.nextInt();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tran= em.getTransaction();
		tran.begin();
		Merchant m=em.find(Merchant.class, mid);
		
		if(m!=null) {
			m.setName("Shridhar");
			m.setEmail("shridhar@gmail.com");
			m.setPhone(8867822258l);
			m.setPassword("asha123");
			m.setGst_num("xyz123");
		}
		else {
			System.out.println("Unable to Update the Record");
		}
		
		tran.commit();
		em.close();
	}

}
