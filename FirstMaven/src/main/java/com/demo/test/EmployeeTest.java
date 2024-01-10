package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;


public class EmployeeTest {
	public static void main(String[] args) {
		
		
//		Employee e1 = new Employee (1,"Abhijit",42153);
//		SessionFactory sf= new Configuration().configure().buildSessionFactory(); 
//		Session s1=sf.openSession();
//		Transaction t1= s1.beginTransaction();
//		s1.save(e1);
//		t1.commit();
//		s1.close();
		
		Employee emp= new Employee(1,"Abhijit",5464864);
		Employee emp1= new Employee(2,"Ritesh",564564);
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s1= sf.openSession();
		Transaction tr=s1.beginTransaction();
		s1.save(emp);
		s1.save(emp1);
		
		//s1.close();		
		//Session s2= sf.openSession();
		Employee e2= s1.get(Employee.class,2);
		System.out.println(e2);
		tr.commit();
		s1.close();
	}

}