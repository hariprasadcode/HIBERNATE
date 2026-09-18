package org.dcl.newjpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Verify {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("email:");
		String em= sc.next();
		System.out.println("Password :");
		String pw=sc.next();
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("dev");
		EntityManager man= fac.createEntityManager();
		Query q=man.createNamedQuery("verify");
		q.setParameter(1, em);
		q.setParameter(2, pw);
		
		
		try {
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println("Verified ");
			
		} catch (NoResultException e) {
			System.out.println("Not Verified");
		}
		
	}

}
