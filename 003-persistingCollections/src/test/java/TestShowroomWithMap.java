import java.util.HashMap;
import java.util.Map;

import org.abhi.datamodel.Car;
import org.abhi.datamodel.ShowroomWithMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestShowroomWithMap {
	@Test
	public void test1() {
		try {
			Map<String, Car> cars = new HashMap<>();
			cars.put("abhi",new Car(0, "ferrari", "red"));
			System.out.println(cars);
			cars.put("pandit", new Car(0, "gallardo", "red"));
			System.out.println(cars);
			cars.put("abhi", new Car(0, "avendator", "black"));
			System.out.println(cars);
			cars.put("pandit", new Car(0, "avendator", "gray"));
			
			System.out.println(cars);
			
			ShowroomWithMap showroomWithmap = new ShowroomWithMap(0, "Abhi", cars);
			
			Configuration configuration = new Configuration().configure("map_hibernate.cfg.xml");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			
			Transaction transaction = session.beginTransaction();
			//session.save(showroomWithmap);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
