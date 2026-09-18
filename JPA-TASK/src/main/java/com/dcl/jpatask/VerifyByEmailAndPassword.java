package com.dcl.jpatask;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyByEmailAndPassword {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Email :");
		String ce=sc.next();
		System.out.println("enter the Password : ");
		String pw=sc.next();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select c from Customer c where c.email=?1 and c.password=?2");
		q.setParameter(1, ce);
		q.setParameter(2, pw);
		
		
		try {
			Customer c=(Customer) q.getSingleResult();
			System.out.println("Verified ");
			
		} catch (Exception e) {
			System.out.println("Not Verified ");
		}
		
		
	}

}
