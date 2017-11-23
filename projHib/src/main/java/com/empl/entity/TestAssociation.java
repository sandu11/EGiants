package com.empl.entity;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.empl.util.HiberanteUtil;

public class TestAssociation {
	
	public static void main(String[] args){
		
		Company comp=new Company(463, "Oracle", "Hyderabad");
		
		Employee emp1= new Employee(50, "Renu", 90000.0f,comp);
		Employee emp2= new Employee(60, "Abhi", 95000.0f,comp);
		
		Set<Employee> emp=new HashSet<Employee>();
		
		emp.add(emp1);
		emp.add(emp2);
		
		comp.setEmployee(emp);
		
		
		SessionFactory sessionfactory = HiberanteUtil.getSessionFactory();
		
		Session session= sessionfactory.openSession();
		
		Transaction transaction =  session.getTransaction();
		
		transaction.begin();
		
			session.save(comp);
			transaction.commit();
		session.close();
		sessionfactory.close();
		
	}

}
