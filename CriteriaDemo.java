import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class CriteriaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Session session = HibernateUtil.getSession();
		
		Criteria criteria = session.createCriteria(Customer.class);
		
		criteria.add(Restrictions.between("creditLimit", 10.0, 5000.0));
		criteria.add(Restrictions.like("custName", "%hooo%"));
		
		List<Customer> customers = criteria.list();
		for (Customer cust: customers)
			System.out.println(cust.getCustId()+"\t"+cust.getCustName());
		
	}

}
