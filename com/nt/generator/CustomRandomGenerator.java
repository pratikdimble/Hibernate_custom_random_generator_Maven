package com.nt.generator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRandomGenerator implements IdentifierGenerator 
{

	public Serializable generate(SessionImplementor ses, Object obj) throws HibernateException 
	{
			int id=0;
			Random rad=null;
			rad=new Random();
			id=rad.nextInt(10);
		return id;
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor ses, Object obj) throws HibernateException {
		int id=0;
		Random rad=null;
		rad=new Random();
		id=rad.nextInt(10000);
	return id;
	}
	

}
