package lti.stock;

public class Stock implements Exchange {

	@Override
	public void setQuote() {
		System.out.println("setting stock");
	}

	@Override
	public void getQuote() {
		System.out.println("getting stock");

	}

	@Override
	public void viewQuote() {
		System.out.println("viewing stock");
	}
	

}
