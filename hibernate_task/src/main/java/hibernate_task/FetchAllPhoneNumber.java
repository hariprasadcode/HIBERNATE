package hibernate_task;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllPhoneNumber {
	 public static void main(String[] args) {
	    Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		
		Query<Long>q=ses.createQuery("select u.phone from User u");
		
		List<Long>u=q.getResultList();
		
		
			for(Long user:u) {
				System.out.println(user);
			}
		
		
		
	}

}
