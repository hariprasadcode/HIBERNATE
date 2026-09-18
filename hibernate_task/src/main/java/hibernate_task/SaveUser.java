package hibernate_task;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=  conf.buildSessionFactory();
		Session ses= sef.openSession();
		
		Transaction tran= ses.getTransaction();
		tran.begin();
		User u= new User();
		u.setName("Ramesh");
		u.setPhone(987654321l);
		u.setEmail("ramesh@gmail.com");
		u.setPassword("akshatha123");
	    int id=(int)ses.save(u);
		tran.commit();
		System.out.println("user saved with id"+id);
	}

}
