import java.util.HashSet;
import java.util.Set;

import org.abhi.datamodel.Car;
import org.abhi.datamodel.ShowroomWithSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestShowroomWithSet {
	@Test
	public void test1() {
		try {
			Set<Car> cars = new HashSet<>();
			cars.add(new Car(0, "ferrari", "red"));
			cars.add(new Car(0, "gallardo", "red"));
			cars.add(new Car(0, "avendator", "black"));
			cars.add(new Car(0, "avendator", "gray"));
			
			System.out.println(cars);
			
			ShowroomWithSet showroomWithSet = new ShowroomWithSet(0, "Abhi", cars);
			
			Configuration configuration = new Configuration().configure("set_hibernate.cfg.xml");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			
			Transaction transaction = session.beginTransaction();
			session.save(showroomWithSet);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
