package com.nt.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.lucky_draw;
import com.nt.utility.HibernateUtil;

public class ClientApp {

	public static void main(String[] args) 
	{
		Session ses = null;
		lucky_draw coupen = null;
		Transaction tx = null;
//get the session
		ses = HibernateUtil.getSession();
				//creating the domain class and set the values
		coupen=new lucky_draw();
		coupen.setCustomerName("Rohit");
		coupen.setBillAmount(80000);
		
		try {
    
			tx = ses.beginTransaction();
   //save the object
			String id=(String)ses.save(coupen);
			tx.commit();  //commit the transaction
			System.out.println("object is saved");
			System.out.println("\n\t***Generated ID Value::: "+id);
		} catch (Exception e) {
			tx.rollback();

		}
		HibernateUtil.closeSession(ses);

		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

	}

}
