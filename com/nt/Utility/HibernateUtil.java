package com.nt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory factory=null;
	static
	{
		Configuration cfg=null;
	cfg=new Configuration();
  //establish the connection between java app and database
	cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
  //create session factory
	factory=cfg.buildSessionFactory();
	}
	
	
	public static Session getSession() {
		Session ses=null;
		if(factory!=null)
    //create the session
		ses=factory.openSession();
		return ses;
	}
  //close the session
	public static void closeSession(Session ses) {
		if(ses!=null)
				ses.close();
		}
    //close the session factory
	public static void closeFactory() {
		if(factory!=null)
		factory.close();
		
	}
}
