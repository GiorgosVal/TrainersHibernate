package com.mycompany.trainershibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

		}catch (Throwable ex) {
			System.err.println("Session Factory could not be created." + ex);
			throw new ExceptionInInitializerError(ex);
		}	
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}



/*

SessionFactory είναι σαν το EntityManagerFactory
Sassion είναι σαν το EntityManager
Από αυτό αρχείο φτιάχνω sessions τα οποία γίνονται map με το session id
Αυτό το αρχείο μπορούμε να το πάρουμε copy-paste και σε αλλα projects


*/
