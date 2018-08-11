package lti.pojo.tablepersubclass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestBillingDetails {

	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		BankAccount bankAcc = new BankAccount();
		bankAcc.setOwner("Poloo");
		bankAcc.setNumber("12346");
		bankAcc.setBankName("ICICI Bank");

		CreditCard creditCard = new CreditCard();
		creditCard.setOwner("Mil");
		creditCard.setNumber("413901234567890");
		creditCard.setType("VISA");
		creditCard.setExpiryMonth("12");
		creditCard.setExpiryYear("2099");
		
		session.save(bankAcc);
		session.save(creditCard);
		
		tx.commit();
		
	}
}
