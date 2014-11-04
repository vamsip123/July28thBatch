package com.tutorial;

import org.hibernate.Session;

import com.tutorial.user.DBUser;
import com.tutorial.util.HibernateUtil;

public class AppGet {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		/**
		 * session.beginTransaction() is not required when you just query the DB.
		 * session.getTransaction().commit() is also not Required
		 */
//		session.beginTransaction();
		/**
		 * Returns POJO Object
		 * Its early loading
		 * If no rows in db then it returns null
		 */
		DBUser obj = (DBUser)session.get(DBUser.class,777);
		System.out.println("AppGet.main()" + obj);
//		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppLoad