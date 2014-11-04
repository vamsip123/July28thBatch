package com.tutorial.compositePK4;

//CustomerClientSave.java

import org.hibernate.*;
import org.hibernate.cfg.*;


public class CustomerClientSave {
	
	public static void main(String []args)
	{
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		CompKey compKey = new CompKey(1, 9);
		CustomerBean cb = new CustomerBean();
		cb.setKey(compKey);		
		cb.setAmount(50000);
							
		session.save(cb);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
