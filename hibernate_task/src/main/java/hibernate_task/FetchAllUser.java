package hibernate_task;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllUser {
	public static void main(String[] args) {
		Configuration conf =new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		
		Query<User> q=ses.createQuery("select u from User u");
		
	     List<User>u=q.getResultList();
	     for(User user:u) {
	    	 System.out.println(user);
	     }
		
	}

}
