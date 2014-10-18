package com.tutorial.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class DemoClient {
	public static void main(String args[]) {
		
		/*HelloImpl hello = new HelloImpl();
		hello.setMessage("Hi");
		System.out.println(hello.wish("Jayram"));
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/spring.cfg.xml");
		DemoInter d1 = (DemoInter) ctx.getBean("demo");
		ctx.close();
		
		Resource res = new ClassPathResource(
				"com/tutorial/spring/spring.cfg.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		factory.getBean("helloOne");
//		factory.getBean("helloOne");
		
//		System.out.println(d.wish("Jayram"));
*/		
		
		/*Company comp = new CarCompany();
		System.out.println(comp.logoName());
		
		
		Company comp2 = new CarCompany();
		System.out.println(comp2.logoName());*/
		
		Resource res = new ClassPathResource(
				"com/tutorial/spring/spring.cfg.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		Company comp = (Company)factory.getBean("comp");
		System.out.println(comp.logoName());
		
		CarCompany comp2 = new CarCompany();
		Company com = (Company)comp2;
		
	}
}