package info.inetsolv;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static SessionFactory sessionfactory;
	static{
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionfactory= configuration.buildSessionFactory();
	}
	public static SessionFactory createSessionFactory()
	{
		System.out.println("Returning old sessionFactory");
		return sessionfactory;
	}	
	private HibernateSessionFactory() {
	}
}