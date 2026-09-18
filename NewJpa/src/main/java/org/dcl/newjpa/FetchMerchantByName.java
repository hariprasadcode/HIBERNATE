package org.dcl.newjpa;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchMerchantByName {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name :");
		String nam=sc.next();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Query q=em.createQuery("select m from Merchant m where m.name=?1");
		q.setParameter(1, nam);
		
		List<Merchant> nlist=q.getResultList();
		if(nlist.size()>0) {
			for (Merchant n : nlist) {
				System.out.println(n);
			}
		}
		else {
			System.out.println("no merchant found with name : "+nam);
		}
		
		
	}

}
