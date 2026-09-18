package hibernate_task;




import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindById {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Id : ");
		int uid=sc.nextInt();
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		
		User u=ses.get(User.class, uid);
		if(u!=null) {
			System.out.println(u.getName());
		}
		else {
			System.err.println("INVALID ID");
		}
		
		
	}

}
