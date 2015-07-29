import java.util.Date;

import org.abhi.ad.datamodel.Course;
import org.abhi.ad.datamodel.CourseID;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestCase2SaveCopositeKeyRecords {
	@Test
	public void test1() {
		try {
			Configuration configuration = new Configuration().configure();
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
			
			Session session = sessionFactory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			
			session.save(new Course(new CourseID("java", new Date()), "8.00 to 17.30", "201", "15"));
			transaction.commit();
			session.close();
			sessionFactory.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
