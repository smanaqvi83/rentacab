package assets.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assets.IUKCodesDAO;

public class Factory {

	private static Factory __this = new Factory();
	
	private ApplicationContext applicationContext;
	
	private Factory(){
		applicationContext = new ClassPathXmlApplicationContext("../applicationContext.xml");
	}
	
	static public IUKCodesDAO getUKCodesDAO(){
		return (IUKCodesDAO)__this.applicationContext.getBean("ukPostCodes");
	}
	
	
}
