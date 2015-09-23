package MainPackage.copy;
// import date library 
import java.util.Date;
// create account class
public class Account {
	// create specified fields and default value 
	private int id;
	private double balance = 0;
	private double annualInterestRate = 0 ;
	private Date dateCreated = new Date();
	// create a constructor with specified values for attributes 
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	// create a no arg constructor with defualt values 
	public Account() {
		super();
		this.balance=0;
		this.annualInterestRate=0;
		this.id=0;
	}
	

	// create specified accessors and mutators 
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double getAnnualInterestRate() {
		return annualInterestRate;
	}



	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}



	public Date getDateCreated() {
		return dateCreated;
	}


	public double getMonthlyInterestRate(){
		double interestRate=this.getAnnualInterestRate() / 12 ;
		return interestRate;
	}
	
	// create withdraw method 
	public void withdraw(double withdrawl) throws InsufficientFundsException
	{
		double overdrawl = 0;
		// if withdraw is lesss than balance just decrement balance
		if (withdrawl <= balance )
		{
			this.balance-=withdrawl;
		}
		else{ // if not throw overdrawl amount into InsufficientFunds
			// exception to be handled 
			overdrawl= withdrawl - balance;
			throw new InsufficientFundsException(overdrawl);
		}
	}
// create deposit method()
	public void deposit(double amount){
		this.balance+=amount;
	}
	
	





	
	
	
	

}
