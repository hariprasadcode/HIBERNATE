package org.dcl.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchandUpdate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id to update");
		int eid=sc.nextInt();
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran =ses.getTransaction();
		tran.begin();
		Employee e=ses.get(Employee.class, eid);
		if(e!=null) {
			e.setName("Ram");
			e.setDesg("TL");
			e.setEmail("rams@gmail.com");
			e.setPassword("radha123");
			e.setSalary(60000);
			e.setPhone(8887776654l);
		}
		else {
			System.out.println("unample to update");
		}
		tran.commit();
	}

}
