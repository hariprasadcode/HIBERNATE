package org.dcl.hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCFG {
	
  public static void main(String[] args) {
	
	  Configuration conf= new Configuration();
	  conf.configure();//load
	  SessionFactory sef=conf.buildSessionFactory();//vaidate
	  System.out.println(sef);
}

}
