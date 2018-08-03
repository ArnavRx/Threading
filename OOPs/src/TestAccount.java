import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {
		Bank ac = AccountFactory.openAccount("current", "Polo");
		ac.summary();
		ac.deposit(2000);
		ac.deposit(4000);
		try {
			ac.withdraw(30000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//System.out.println(e); // for logging to audit
			System.out.println(e.getMessage()); //end user
			//e.printStackTrace(); // to troubleshoot
		}
		//ac.statement();
		ac.CurrentTransaction();

	}
}
