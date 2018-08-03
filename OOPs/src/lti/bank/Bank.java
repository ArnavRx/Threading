package lti.bank;

public interface Bank {
	int INIT_ACNT_NO = 1001;
	double MIN_SAV_BAL = 1000;
	double MIN_CUR_BAL = 0;
	double INIT_CUR_BAL = 5000;

	double OVERDRAFT_AMT = 10000;

	void summary();

	double getBalance();

	void deposit(double amount);

	void withdraw(double amount) throws BalanceException;

	void statement();
	
	void CurrentTransaction();
}
