package main;

public class insufficientFundsException extends Exception{
	
	private double withdrawl;
	
	public insufficientFundsException(double withdrawl){
		this.withdrawl = withdrawl;
		
	}
	
	public double getWithdrawl(){
		return withdrawl;
		
	}

}
