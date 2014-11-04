package com.tutorial;

import org.hibernate.Session;

import com.tutorial.user.DBUser;
import com.tutorial.util.HibernateUtil;

public class AppLoad {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		/**
		 * Returns POJO Object
		 * Its lazy loading till we call the get methods.
		 * If no rows in db then it throws Exception : org.hibernate.ObjectNotFoundException
		 */
		DBUser obj = null;
		obj = (DBUser)session.load(DBUser.class,515);
//		System.out.println("AppGet.main() 1" + obj.getUsername());
		
//		obj = new DBUser();
//		session.load(obj,777);
		System.out.println(obj.getUsername());
		
		/**
		 * Returns Void
		 * its Early Loading
		 */
		/*
		 */
		
//		System.out.println("AppGet.main() 2" + obj);

//		session.getTransaction().commit();
		
		session.close();
	}
} // Previous AppGet