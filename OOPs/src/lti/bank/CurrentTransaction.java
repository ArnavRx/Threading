package lti.bank;

public class CurrentTransaction extends Transaction {
	private double od;
@Override
public void withdraw(double amount) throws BalanceException {
}
	public CurrentTransaction() {
	}
	
	

	public CurrentTransaction(String type, double amount, double balance,double od) {
		super(type,amount,balance );
		this.od = od;
	}

	public String toString()
	{
		return type +"\t" + amount + "\t" +balance+ "\t" + od;
	}

}
