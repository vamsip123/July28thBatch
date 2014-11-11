package com.tutorial.spring.orm_03._04NamedQueries;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class DemoClient
{
	private HibernateTemplate ht = null;
	public List getUserList() {
		return ht.findByNamedQuery("users", new Object[]{"%S%"});
	}
	
	public void setHt(HibernateTemplate ht) {
		System.out.println("setter of spring");
		this.ht = ht;
	}
}