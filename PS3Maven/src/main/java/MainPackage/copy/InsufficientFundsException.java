package MainPackage.copy;

// create InsufficientFundsException class of Exception class 
public class InsufficientFundsException extends Exception {
	private double amount;
	// create exception method 
	public InsufficientFundsException(double amount) {
		this.amount=amount;
	}
	// create a getAmount() method to access amount overdrawn 
	public double getAmount(){
		return amount;
	}
	
}
