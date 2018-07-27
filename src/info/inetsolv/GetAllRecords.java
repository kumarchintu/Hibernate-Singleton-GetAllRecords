package info.inetsolv;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetAllRecords {
	public static void main(String args[]) {
		SessionFactory sessionFactory = HibernateSessionFactory.createSessionFactory();
		Session session = sessionFactory.openSession();
		String hqlQuery = "FROM info.inetsolv.Employee";
		Query query = session.createQuery(hqlQuery);
		List<Employee> empList = query.list();
//		List<Employee> empList = query.getResultList();
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("Hello HQL");
		session.close();
	}
}
