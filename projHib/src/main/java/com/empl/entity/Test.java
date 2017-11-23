package com.empl.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.empl.util.HiberanteUtil;

public class Test {
	
	public static void main(String[] args){
		
		SessionFactory sessionFactory= HiberanteUtil.getSessionFactory();	
		//SessionFactory is created to create a session
		//session is created as it used to interact with database
		 
		Session session= sessionFactory.openSession();
		
		Employee employee= session.get(Employee.class, 10);
		
		System.out.println("Employee ID: 	"+employee.getEmpid());
		System.out.println("Employee Name:  "+employee.getEmpname());
		
		session.close();
		
		sessionFactory.close();
		
		
	}

}
