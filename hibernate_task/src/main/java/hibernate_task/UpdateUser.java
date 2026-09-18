package hibernate_task;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the ID : ");
		int uid=sc.nextInt();
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
		Transaction tran= ses.getTransaction();
		tran.begin();
		User u=ses.get(User.class, uid);
		
		if(u!=null) {
			u.setName("Aishwarya");
			u.setEmail("aishwarya@gmail.com");
			u.setPassword("AkshathaRamesh");
			u.setPhone(9988776655l);
			tran.commit();
		}
		else {
			System.out.println("Unable to update. ID is invalid");
		}
	}

}
