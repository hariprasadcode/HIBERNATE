package org.dcl.hib;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchEmployee {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id: ");
		int eid=sc.nextInt();
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Employee e=ses.get(Employee.class, eid);
		if(e!=null) {
			
			System.out.println(e.getName());
		}
		else {
			System.out.println("invalid id");
		}
		
//		try {
//			Employee e=ses.load(Employee.class, eid);
//			System.out.println(e.getName());
//		}
//		catch(ObjectNotFoundException e) {
//			System.out.println("no employee info");
//		}
	}

}
