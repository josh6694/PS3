package MainPackage.copy;
// This is a test class I used prior to j unit to ensure
// My methods were working accordingly 

public class Test {
	// set class and variables
	public static void main(String[] args) throws InsufficientFundsException{
	int ID = 1122;
	double Balance = 20000;
	double AnnualInterestRate = 0.045;
	Account test1 = new Account(ID,Balance, AnnualInterestRate);

	// set try and catch to test exception class 
	System.out.println(test1.getBalance());
	try{
	test1.withdraw(115000);}
	
	catch(InsufficientFundsException e){
		System.out.println("overdraw of: "+ e.getAmount());
		
	}
	System.out.println(test1.getDateCreated());
	}
}
