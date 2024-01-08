package com.hiberEx;

import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiberEx.Util.HibernateUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //Configuration cfg = new Configuration();
       //cfg.configure();
       // cfg.configure("hibernate.xml");
       // SessionFactory factory = cfg.buildSessionFactory();
       // System.out.println(factory);
       // cfg.addAnnotatedClass(Student.class);
    // Student st = new Student(5, "Sweety", "Home", "Viktesttoken");
        Student s = new Student();
        s.setName("Sanju");
        s.setAddress("Temp ");
        s.setToken("test");
        SessionFactory sessionFactory2 = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        System.out.println(sessionFactory2);
        Session session = sessionFactory.openSession();
        Session session2 = sessionFactory2.openSession();
       Transaction tx = session.beginTransaction();
       session.save(s);
        
        //Student student = session.get(Student.class,1);
      //  Student student1 = session.get(Student.class,3);
        //session.remove(st);
      // IdentifierLoadAccess byId = session.byId("4");
        tx.commit();
        session.close();
        //System.out.println(student);
       // System.out.println(student1);
        //System.out.println(byId);
        
       
        
    }
}
