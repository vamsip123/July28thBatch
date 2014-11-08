package com.tutorial.hibernate.mappings.association.m2m;

// 1st
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppClient {
	private static SessionFactory factory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure("hibernate.mysql.cfg.xml")
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		Session session = factory.openSession();
		session.beginTransaction();

		Stock stock = new Stock();
		stock.setStockCode("2222");
		stock.setStockName("INFOSYS");

		Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
		Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");

		Set<Category> categories = new HashSet<Category>();
		categories.add(category1);
		categories.add(category2);

		stock.setCategories(categories);

		session.save(stock);

		session.getTransaction().commit();
		System.out.println("Done");
	}
}
