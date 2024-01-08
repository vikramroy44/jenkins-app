package com.hiberEx.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiberEx.Student;
import com.hiberEx.OneToOneM.EmpDetails;
import com.hiberEx.OneToOneM.Address;

public class  HibernateUtil {
	private static SessionFactory sessionFactory= null;

	public static SessionFactory getSessionFactory() {
		System.out.println(sessionFactory);
		if(sessionFactory==null) {
			Configuration confg = new Configuration();
			confg.configure("hibernate.cfg.xml");
			//confg.addAnnotatedClass(Student.class);
			confg.addAnnotatedClass(EmpDetails.class);
			confg.addAnnotatedClass(Address.class);
			sessionFactory = confg.buildSessionFactory();
		
		}
		return sessionFactory;
		
	}

}
