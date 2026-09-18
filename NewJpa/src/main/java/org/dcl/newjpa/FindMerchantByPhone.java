package org.dcl.newjpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByPhone {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Phone Number :");
		Long ph=sc.nextLong();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q=em.createQuery("select m from Merchant m where m.phone=?1");
		
		q.setParameter(1, ph);
		try {
			
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println(m);
		} catch (NoResultException e) {
			System.out.println("No Merchant found ! ");
		}
		
		
		
		
	}

}
