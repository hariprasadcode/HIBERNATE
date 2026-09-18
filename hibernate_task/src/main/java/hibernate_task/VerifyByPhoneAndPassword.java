package hibernate_task;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyByPhoneAndPassword {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the phome Number :");
		long ph=sc.nextLong();
		
		System.out.println("Enther the Password :");
		String pw=sc.next();
		
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses=sef.openSession();
	    Query<User> q= ses.createQuery("select u from User u where u.phone=?1 and u.password=?2");
	    q.setParameter(1,ph);
	    q.setParameter(2,pw);
	    try {
	    	User u=q.getSingleResult();
	    	System.out.println("verified ");
	    }catch (Exception e) {
		   
	    	System.out.println("User is not verfied");
		}
		
		
		
	
	}

}
