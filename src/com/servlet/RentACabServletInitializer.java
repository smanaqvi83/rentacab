package com.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import snippet.HibernateUtil;

public class RentACabServletInitializer implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
//		HibernateUtil.shutdown();
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Creating session factory.....");
//		HibernateUtil.getSessionFactory();
		
	}

}
