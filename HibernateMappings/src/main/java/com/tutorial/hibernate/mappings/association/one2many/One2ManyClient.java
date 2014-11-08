package com.tutorial.hibernate.mappings.association.one2many;
// 3rd
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2ManyClient {
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


		HashSet set1 = new HashSet();
		
		set1.add(new Certificate("SCJP")); 
		set1.add(new Certificate("ORACLE")); 
		set1.add(new Certificate("MBA"));

		One2ManyClient ec = new One2ManyClient();

		ec.addStudent("Jayram", "Rout", 5000, set1);

	}
	public Integer addStudent(String fname, String lname, int salary, Set cert){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer studentId = null; 
		try{ 
			tx = session.beginTransaction(); 
			Student student = new Student(fname, lname, salary); 
			student.setCertificates(cert); 
			
			studentId = (Integer) session.save(student); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return studentId; 
	}

	/* Method to list all the Students detail */ 
	public void listStudents( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ tx = session.beginTransaction(); 
		List Students = session.createQuery("FROM Student").list(); 
		for (Iterator iterator1 = Students.iterator();iterator1.hasNext();){ 
			Student Student = (Student) iterator1.next(); 
			System.out.print("First Name: " + Student.getFirstName()); 
			System.out.print(" Last Name: " + Student.getLastName()); 
			System.out.println(" Salary: " + Student.getSalary()); 
			Set certificates = Student.getCertificates(); 
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

	/* Method to update salary for an Student */ 
	public void updateStudent(Integer StudentID, int salary ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Student Student = (Student)session.get(Student.class, StudentID); 
			Student.setSalary( salary ); 
			session.update(Student); 
			tx.commit(); 
		}catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	} 
	/* Method to delete an Student from the records */ 
	public void deleteStudent(Integer StudentID){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Student Student = (Student)session.get(Student.class, StudentID); 
			session.delete(Student); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	}
}

