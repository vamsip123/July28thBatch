package com.tutorial;

import java.util.Date;

import org.hibernate.Session;

import com.tutorial.user.DBUser;
import com.tutorial.util.HibernateUtil;

public class AppUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(700);
		user.setUsername("Jayram");
		user.setCreatedBy("Java Faculty");
		user.setCreatedDate(new Date());
		/**
		 * It updates. If row does not exists..then it throws Exception
		 */
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
}//Next AppMerge