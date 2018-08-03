package lti.bank;

public class Current extends Account {
	private double overdraft;

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OVERDRAFT_AMT;
	}

	@Override
	public void deposit(double amount) {
		if (overdraft == OVERDRAFT_AMT) {
			balance += amount;

		} else {
			amount -= (OVERDRAFT_AMT - overdraft);

			if (amount >= 0) {
				overdraft = OVERDRAFT_AMT;
				deposit(amount);
			} else {
				overdraft += amount;
			}
		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= balance) {
			balance -= amount;
		} else if (amount <= (balance + overdraft)) {
			amount -= balance;
			balance = MIN_CUR_BAL;
			overdraft -= amount;

		} else {
			throw new BalanceException("insuffucient");
		}

	}

}
