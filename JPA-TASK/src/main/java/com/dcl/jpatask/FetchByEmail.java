package com.dcl.jpatask;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByEmail {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter email : ");
		String ce=sc.next();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c.name from Customer c where c.email=?1");
		q.setParameter(1, ce);
		
		
		try {
			
			String cn= (String) q.getSingleResult();
			System.out.println(cn);
			
			
		} catch (NoResultException e) {
			System.out.println("no such email found");
		}
	}

}
