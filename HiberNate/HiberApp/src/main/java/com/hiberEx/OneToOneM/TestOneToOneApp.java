package com.hiberEx.OneToOneM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hiberEx.Util.HibernateUtil;

public class TestOneToOneApp {
	public static void main(String [] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		System.out.println("App Running");
		
//		 EmpDetails emp = new EmpDetails(); emp.setId(201); emp.setName("VIKRAM");
//		 
//		
//		
//		  Address ad = new Address(); ad.setAddId(101); ad.setAddrs("Lalganj");
//		 session.save(ad); emp.setAddrs(ad); session.save(emp);
//		 
	    EmpDetails details = session.get(EmpDetails.class, 202);
		System.out.println("DAta Inserted");
		System.out.println(details);
		//System.out.println(adr);
		System.out.print(details.getName());
		System.out.println(details.getAddrs().getAddrs());
		
//		Address adr = session.get(Address.class, 101);
//		System.out.println(adr.getAddrs());
//		String name = adr.getEmpDetails().getName();
//		System.out.println(name);
//		tx.commit();
		session.close();
	}

}
