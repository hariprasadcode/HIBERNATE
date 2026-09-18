package com.dcl.jpatask;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindCustomerById {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter customer id: ");
		int cid=sc.nextInt();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select c from Customer c where c.id=?1");
		
		q.setParameter(1, cid);
		
		try {	
			Customer c=(Customer) q.getSingleResult();
			System.out.println(c);
		}catch (Exception e) {
			System.out.println("NO ID FOUND ");
		}
		
		
	}

}
