import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Order;
import lti.util.HibernateUtil;

public class TestObject {

	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();
		txn.begin();
		Order order = new Order();
		order.setAmount(100);
		order.setOrderDate(new Date());
		order.setPromoCode("10001");
		session.save(order);
		txn.commit();
		
	}
}
