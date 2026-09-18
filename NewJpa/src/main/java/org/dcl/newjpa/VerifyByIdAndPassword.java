package org.dcl.newjpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyByIdAndPassword {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Id : ");
		int mid=sc.nextInt();
		System.out.println("Enter the Password : ");
		String mpw=sc.next();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Query q=em.createQuery("select m from Merchant m where id=?1 and password=?2");
		q.setParameter(1, mid);
		q.setParameter(2, mpw);
		
		try {
			
			Merchant m=(Merchant)q.getSingleResult();
			System.out.println("Merchant Verified!! ");
		} catch (NoResultException e) {
			System.out.println("NOT Verified");
		}
		
	}

}
