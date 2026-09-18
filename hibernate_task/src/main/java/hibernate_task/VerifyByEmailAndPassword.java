package hibernate_task;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyByEmailAndPassword {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enthe the Email that u want to verify :");
		String em=sc.next();
		
		System.out.println("Enter the password :");
		String pw=sc.next();
		
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		
		Query<User>q=ses.createQuery("select u from User u where u.email=?1 and u.password=?2");
		q.setParameter(1, em);
		q.setParameter(2, pw);
		
		try {
			User u=q.getSingleResult();
			System.out.println("Verified");
			
		}catch (Exception e) {
			System.out.println("Not verified  ");
		}
		
	}
	

}
