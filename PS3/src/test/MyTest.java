package test;



import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Date;
import main.Account;
import main.insufficientFundsException;
import org.junit.After;
import org.junit.Before;


public class MyTest {

	
	Account A;	
	
	
	@Before
	public void Setup() throws Exception {
		
		A =new Account(1122,20000);
		
	}

	@After
	public void tearDown() throws Exception{
		A= null;
	}
	 
	@Test(expected =insufficientFundsException.class)
	public final void testWithdrawl() throws insufficientFundsException {
		assertEquals(20000,(long)A.getBalance(),(long)500.00);
    A.withdraw(25000);
	}
	
	@Test
	public final void testdeposit(){
		
		A.deposit(200);
		assertEquals(20200,(long)A.getBalance());
		}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public final void testgetBalance(){
		assertEquals(20000,(long)A.getBalance());
	}
	@SuppressWarnings("deprecation")
	@Test
	public final void testgetId(){
		assertEquals(1122,(long)A.getId());
	}
	
}
