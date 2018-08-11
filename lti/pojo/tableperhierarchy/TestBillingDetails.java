package lti.pojo.tableperhierarchy;

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
		bankAcc.setOwner("lolo");
		bankAcc.setNumber("1234");
		bankAcc.setBankName("IChiIChiI Bank");

		CreditCard creditCard = new CreditCard();
		creditCard.setOwner("Lallan");
		creditCard.setNumber("512991234567890");
		creditCard.setType("DOSA");
		creditCard.setExpiryMonth("12");
		creditCard.setExpiryYear("2099");
		
		session.save(bankAcc);
		session.save(creditCard);
		
		tx.commit();
		
	}
}
