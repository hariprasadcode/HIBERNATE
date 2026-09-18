package org.dcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Save 
{
    public static void main( String[] args )
    {
        
    	Configuration conf= new Configuration();
    	conf.configure();
    	conf.addAnnotatedClass(Laptop.class);
    	SessionFactory sef=conf.buildSessionFactory();
    	Session ses=sef.openSession();
    	Transaction tran= ses.getTransaction();
    	tran.begin();
    	
    	Laptop l= new Laptop();
    	l.setId(1);
    	l.setBrand("HP");
    	l.setModel("Victus");
    	l.setPrice(60000);
    	
    	ses.save(l);
    	tran.commit();
    	
    }
}
