	package org.dcl.hib;
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	
	public class Delete {
		public static void main(String[] args) {
			
			Configuration conf = new Configuration();
			conf.configure();
			conf.addAnnotatedClass(Laptop.class);
			SessionFactory sef= conf.buildSessionFactory();
			Session ses=sef.openSession();
			Laptop laptop=ses.get(Laptop.class, 1);
			
			Transaction tran= ses.getTransaction();
			tran.begin();
			ses.delete(laptop);
			
			tran.commit();
		}
		
		
	
	}
