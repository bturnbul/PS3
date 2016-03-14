package main;

import java.util.Date;


public class Account {
	

	private int id = 0;
	private double balance=0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){
		
	}
	
	
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
			
	}


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
	
	public Date getdateCreated() {
		return dateCreated;
	}	
	
	public double getMonthlyInterest(){
		double monthlyInterest = this.annualInterestRate / 12;
		return monthlyInterest;
	}
	
	public void withdraw(double withdrawl) throws insufficientFundsException{
	if (withdrawl > this.balance){
		double deficit = withdrawl - balance;
		throw new insufficientFundsException(deficit);
		}
	else{
		this.balance= this.balance - withdrawl;
	}
	
	}
	
public void deposit(double deposit ){
		
				
		this.balance= this.balance + deposit;
	}
}
