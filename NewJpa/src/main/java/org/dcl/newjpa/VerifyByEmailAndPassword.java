package org.dcl.newjpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyByEmailAndPassword {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Email : ");
		String emai=sc.next();
		System.out.println("Enter Password : ");
		String pw=sc.next();

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q=em.createQuery("select m from Merchant m where m.email=?1 and m.password=?2");
		q.setParameter(1, emai);
		q.setParameter(2, pw);
		try {
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println("Merchant Verfier !!!");
		} catch (NoResultException e) {
			System.err.println("Merchet "+emai+" is Not Verified!!");
		}
		
	}

}
