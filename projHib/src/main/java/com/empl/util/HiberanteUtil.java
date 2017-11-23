package com.empl.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.empl.entity.Company;
import com.empl.entity.Employee;

public class HiberanteUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		//static block- first the memory variables are loaded then the static blocks are executed after the class loaded. 
		
		Configuration configuration= new Configuration(); 
		//configuration class is used to bootstrap the hibernate
		
		configuration.configure();	//method loads hibernate.cfg.xml
		//if the filename is different, then we need to configure the config file explicitly
		
		configuration.addAnnotatedClass(Employee.class);
		//register the entity class 
		configuration.addAnnotatedClass(Company.class);
				
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		//ServiceRegistry object is used to start the basic services of hibernate
		
		sessionFactory =configuration.buildSessionFactory(serviceRegistry);
		//buildsessionFactory method creates sessionFactory object
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	

}
