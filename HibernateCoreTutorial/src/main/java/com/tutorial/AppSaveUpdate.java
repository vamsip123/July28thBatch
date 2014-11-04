package com.tutorial;

import java.util.Date;

import org.hibernate.Session;

import com.tutorial.user.DBUser;
import com.tutorial.util.HibernateUtil;

public class AppSaveUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(888);
		user.setUsername("superman11");
		user.setCreatedBy("system Engineer");
		user.setCreatedDate(new Date());
		/**
		 * Returns VOID
		 * Selects if row is there..if not then inserts...if there then updates
		 */
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppDelete