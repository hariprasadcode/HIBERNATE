package org.dcl.newjpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyMerchantByPhoneAndPassword {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the phone number : ");
		long ph=sc.nextLong();
		System.out.println("enter the password : ");
		String pw=sc.next();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q=em.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
		q.setParameter(1, ph);
		q.setParameter(2, pw);
		
		try {
			
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println("Merchant Varified");
		}catch(NoResultException e) {
			System.out.println("not Varified!");
		}
	}

}
