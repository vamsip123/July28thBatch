package com.tutorial.hibernate.mappings.association.many2many;
// 4th
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2ManyClient {
	private static SessionFactory factory;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
			factory = new Configuration().configure("hibernate.mysql.cfg.xml").buildSessionFactory(); 
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex); 
			throw new ExceptionInInitializerError(ex); 
		}
		HashSet certificates = new HashSet();
		certificates.add(new Certificate("SCJP")); 
		certificates.add(new Certificate("MCA")); 
		certificates.add(new Certificate("MBA"));

		Many2ManyClient mm = new Many2ManyClient();

		mm.addNewJoinee("Jayram", "Rout", 5000, certificates);

	}
	public Integer addNewJoinee(String fname, String lname, int salary, Set cert){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer NewJoineeID = null; 
		try{ 
			tx = session.beginTransaction(); 
			NewJoinee newJoinee = new NewJoinee(fname, lname, salary); 
			newJoinee.setCertificates(cert); 
			NewJoineeID = (Integer) session.save(newJoinee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return NewJoineeID; 
	}

	/* Method to list all the NewJoinees detail */ 
	public void listNewJoinees( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ tx = session.beginTransaction(); 
		List NewJoinees = session.createQuery("FROM NewJoinee").list(); 
		for (Iterator iterator1 = NewJoinees.iterator();iterator1.hasNext();){ 
			NewJoinee NewJoinee = (NewJoinee) iterator1.next(); 
			System.out.print("First Name: " + NewJoinee.getFirstName()); 
			System.out.print(" Last Name: " + NewJoinee.getLastName()); 
			System.out.println(" Salary: " + NewJoinee.getSalary()); 
			Set certificates = NewJoinee.getCertificates(); 
			for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext();){ 
				Certificate certName = (Certificate) iterator2.next(); 
				System.out.println("Certificate: " + certName.getName()); 
			} 
		} 
		tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	}

	/* Method to update salary for an NewJoinee */ 
	public void updateNewJoinee(Integer NewJoineeID, int salary ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			NewJoinee NewJoinee = (NewJoinee)session.get(NewJoinee.class, NewJoineeID); 
			NewJoinee.setSalary( salary ); 
			session.update(NewJoinee); 
			tx.commit(); 
		}catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	} 
	/* Method to delete an NewJoinee from the records */ 
	public void deleteNewJoinee(Integer NewJoineeID){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{
			tx = session.beginTransaction(); 
			NewJoinee NewJoinee = (NewJoinee)session.get(NewJoinee.class, NewJoineeID); 
			session.delete(NewJoinee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	}
}

