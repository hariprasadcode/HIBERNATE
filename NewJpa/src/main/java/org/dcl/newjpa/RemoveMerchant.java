package org.dcl.newjpa;



import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveMerchant {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id :");
		int mid=sc.nextInt();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tran= em.getTransaction();
		
		tran.begin();
		
		Merchant me=em.find(Merchant.class, mid);
		
		if(me!=null) {
			
			em.remove(me);
			tran.commit();
		}
		else{
			System.out.println("unable the Delete a record of id "+mid);
		}
		
		
		em.close();
		
	}

}
