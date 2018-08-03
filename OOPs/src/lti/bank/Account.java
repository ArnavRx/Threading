package lti.bank;

/**
 * This Class represents generalised bank account
 * 
 * @author VrAgAj
 * @version 1.0
 */

public abstract class Account implements Bank {
	private int actNo;
	private String holder;
	protected double balance;
	private static int autogen = INIT_ACNT_NO;

	protected Transaction[] txns;
	protected int idx;
	protected int idy;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.actNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		// Adding opening account transaction
		if (this instanceof Savings) {
			txns = new Transaction[10];
			txns[idx++] = new Transaction("OB", balance, balance);
		} else {
			txns = new CurrentTransaction[10];
			txns[idy++] = new CurrentTransaction("OB", balance, balance, OVERDRAFT_AMT);
		}
	}

	public void summary() {
		System.out.println("a/c no" + actNo);
		System.out.println("holder" + holder);
		System.out.println("balance" + balance);

	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transaction("Cr", amount, balance);

	}

	public void statement() {
		System.out.println("Statement of a/c" + actNo);
		for (int i = 0; i < idx; i++) {
			System.out.println(txns[i]);

		}
	}

	public void CurrentTransaction() {
		System.out.println("Statement of a/c" + actNo);
		for (int i = 0; i < idy; i++) {
			System.out.println(txns[i]);

		}
	}
}
