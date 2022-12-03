package com.learningjava.backdemo;

public class Account {
	
	private double balance;
	
	//Set balance to 0.00
	public Account() {
		balance = 0.0;
	}
	
	//Deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	//Withdraw
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		}else {
			System.err.println("Your balance is " + balance + " not enough");
		}		
	}
	
	//Get Balance
	public double getBalance() {
		return balance;
	}

}
