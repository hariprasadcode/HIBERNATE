package com.dcl.jpatask;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UdateCustomer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id :");
		int cid=sc.nextInt();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tran= em.getTransaction();
		
		tran.begin();
		Customer c=em.find(Customer.class, cid);
		
		if(c!=null) {
			c.setName("Prasad");
			c.setEmail("prasad@gmail.com");
			c.setPassword("prasad123");
			c.setPhone(8867822258l);
			
		}
		else {
			System.out.println("sorry unable to update ");
		}
		tran.commit();
	}

}
