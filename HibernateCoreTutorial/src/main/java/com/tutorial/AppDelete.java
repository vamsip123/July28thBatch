package com.tutorial;

import java.util.Date;

import org.hibernate.Session;

import com.tutorial.user.DBUser;
import com.tutorial.util.HibernateUtil;

public class AppDelete {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(500);
		
		/**
		 * Returns VOID
		 * Selects if row is there..if there then deletes...else ignores
		 */
		session.delete(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppGet