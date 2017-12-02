package com.nt.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


/*CREATE SEQUENCE coupen_seq
  MINVALUE 1
  START WITH 1
  INCREMENT BY 1
 / 
 
  */

public class CustomRandomGenerator implements IdentifierGenerator 
{

	@Override
	public Serializable generate(SharedSessionContractImplementor ses, Object obj) throws HibernateException 
	{
		try
		{
    //create connection for getting the session
			Connection  con=ses.connection();
      //prapre the statement for crateing the genaration the id value
			PreparedStatement ps=con.prepareStatement("select coupen_seq.nextVal from dual");
			ResultSet rs=ps.executeQuery();
			
				int id=0;
					if(rs.next())
					{
						id=rs.getInt(1);
					}
						if (id<10)  //if id is <10 the prefix with Bajaj00
						{
							return "Bajaj00"+id;
						}
						else if(id<100)    //if id is <100 the prefix with Relience00
						{
							return "Relience00"+id;   
						}
							else    //if id is >100 the prefix with DMart00
							{
								return "DMart00"+id;
							}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "Failed To Generate ID Value";
		}
	

}
