package hibernate_task;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindByName {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user NAME :");
		String uname=sc.next();
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses= sef.openSession();
		Query<User>q=ses.createQuery("select u from User u where u.name=?1");
	    q.setParameter(1, uname);
	    
	   List<User>lu=q.getResultList();
	   if(lu.size()>0) {
		   for(User user:lu) {
			   System.out.println(user);
		   }
	   }
	   else {
		   System.out.println("no user found");
	   }
	   
	}

}
