package org.dcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
	
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e= new Employee();
		e.setName("Krishna");
		e.setPhone(9988776655l);
		e.setDesg("Manager");
		e.setSalary(60000);
		e.setEmail("krishna@gmail.com");
		e.setPassword("radha123");
		ses.save(e);
		tran.commit();
	}

}
