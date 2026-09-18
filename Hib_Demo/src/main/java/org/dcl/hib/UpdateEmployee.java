package org.dcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e= new Employee();
		e.setId(1);
		e.setName("Shiva");
		e.setDesg("CEO");
		e.setEmail("Shiva@mail.com");
		e.setPassword("parvathi123");
		e.setPhone(1231231239l);
		tran.commit();
	}

}
