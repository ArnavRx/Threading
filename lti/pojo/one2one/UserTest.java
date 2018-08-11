package lti.pojo.one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;
import oracle.net.aso.a;

public class UserTest {
	@Test
	public void testCase1() {
		Session session =HibernateUtil.getSession();
		Transaction tx= session.beginTransaction();
		
		User u = new User();
				u.setFirstname("punch");
				u.setLastname("nuts");
				u.setUsername("boomer");
				u.setPassword("boomer123");
				
		Address address= new Address();
		address.setCity("mumbaaaa");
		address.setStreet("powiiiii");
		address.setZipcode("400033");
		
		u.setAddress(address);
		address.setUser(u);
		
		session.save(u);
		//session.save(address);
		tx.commit();
		
	}

}
