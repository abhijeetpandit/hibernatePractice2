import org.abhi.datamodel.Car;
import org.abhi.datamodel.Engine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestOneToOneAssociation {
	@Test
	public void testInsert() {
		try {
			Configuration configuration = new Configuration().configure("oneToOne.cfg.xml");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			Car car = new Car(0, "Maruti Suzuki", "White", null);
			
			Engine engine = new Engine(null, "GPseries 1000", "8000cc", "1 sq meter", null);
			
			car.setEngine(engine);
			engine.setCar(car);
			
			session.save(car);
			session.save(engine);
			
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
