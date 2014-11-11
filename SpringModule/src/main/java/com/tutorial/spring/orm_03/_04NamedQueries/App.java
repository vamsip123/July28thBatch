package com.tutorial.spring.orm_03._04NamedQueries;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/orm_03/_04NamedQueries/SpringHibernate.xml");
			BeanFactory factory = (BeanFactory)ctx;
			DemoClient d = (DemoClient)factory.getBean("d1");
			List userList =	d.getUserList();
			Iterator iter = userList.iterator();
			while(iter.hasNext()) {
				User ob=(User)iter.next();
				System.out.print(ob.getUid());
				System.out.println(" "+ob.getUname()+" "+ob.getRole());
				System.out.println("--------------");
			}
		}
}
