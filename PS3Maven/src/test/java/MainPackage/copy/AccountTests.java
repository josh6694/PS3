package MainPackage.copy;

// import need junit libraries 
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTests {

	// set account field 
	Account test;
	
	// crete test class in before (setUp()) of junit test
	@Before 
	public void setUp() throws Exception {
		test = new Account(1122,20000,0.045);


	}
	
	// tear down tests after implementing 
	@After
	public void tearDown(){ //throws //Exception {
		test = null;
	}

	// test deposit/withdraw method  
	@Test(expected=InsufficientFundsException.class)
	public final void testwithdraw() throws InsufficientFundsException {
		test.deposit(5000.00);
		assertEquals("testing",(long)test.getBalance(),(long)25000.00);
		test.withdraw(900000);
		test.withdraw(2500);
		assertEquals("Withdrew 2500", (long)test.getBalance(),(long)22500.00);
		test.deposit(3000);
		assertEquals("Deposited 3000", (long)test.getBalance(),(long)27500.00);
		
	}
// test id method and print methods to ensure they are working
	@Test
	public final void testId() {
		assertTrue(test.getId()==1122);
		System.out.println("balance: " + test.getBalance());
		System.out.println("Annual Interest Rate: " + test.getAnnualInterestRate());
		System.out.println("Date Created: "+ test.getDateCreated());
		}
	
}

