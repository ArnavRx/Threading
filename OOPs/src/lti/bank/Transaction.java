package lti.bank;

public class Transaction extends Account {

	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		
	}
	protected String type;
	protected double amount;
	protected double balance;
	public Transaction() {
	}
	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public String toString()
	{
		return type +"\t" + amount + "\t" +balance;
	}
	

}
