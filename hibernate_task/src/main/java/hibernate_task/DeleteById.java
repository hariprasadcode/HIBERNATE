package hibernate_task;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteById {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id : ");
		int uid=sc.nextInt();
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses= sef.openSession();
	    Transaction tran= ses.getTransaction();
	    tran.begin();
	    
	    User u=ses.get(User.class, uid);
	    if(u!=null) {
	    	ses.delete(u);
	    	tran.commit();
	    	System.out.println("Details of user id :"+uid+" is Deleted");
	    }
	    else {
	    	System.err.println("invalid ID ");
	    }
	}

	
}
