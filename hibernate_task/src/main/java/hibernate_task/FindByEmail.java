package hibernate_task;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindByEmail {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the email id :");
		String uemail=sc.next();
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		
		Query<User>q=ses.createQuery("select u from User u where u.email=?1");
		q.setParameter(1, uemail);
		
		try {
			User u=q.getSingleResult();
			System.out.println(u);
		}
		catch (Exception e) {
			System.out.println("Invalid Email");
		}
	}

}
