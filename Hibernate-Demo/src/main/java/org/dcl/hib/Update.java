package org.dcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Laptop.class);
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		
		Laptop laptop=ses.get(Laptop.class, 1);
		laptop.setModel("V");
		laptop.setPrice(70000);
		
		Transaction tran= ses.getTransaction();
		tran.begin();
		
		ses.update(laptop);
		
		
		tran.commit();
		ses.close();
		sef.close();
	}

}
