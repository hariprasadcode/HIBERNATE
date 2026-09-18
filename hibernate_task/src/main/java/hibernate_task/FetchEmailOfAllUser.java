package hibernate_task;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchEmailOfAllUser {
	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		
	Query<String>q=ses.createQuery("select u.email from User u");
	 List<String>l=q.getResultList();
	 
	 if(l.size()>0) {
		 
		 for(String em:l) {
			 System.out.println(em);
		 }
	 }
	 else {
		 System.out.println("NON email found");
	 }
	}

}
