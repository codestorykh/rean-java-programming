package com.learningjava.backdemo;

public class BankMain {

	public static void main(String[] args) {
		
		//Account account1 = new Account();
		//account1.deposit(500);
		
		Account account2 = new Account();
		account2.deposit(100);
		account2.withdraw(500);
		
		/*System.out.print("Customer1 has a balance of ");
		System.out.println(account1.getBalance());
		*/
		System.out.print("\n Customer2 has a balance of ");
		System.out.println(account2.getBalance());
		
		//**********************************
		
		BankAccount th = new BankAccount();
		th.deposit(600);
		
		BankAccount da = new BankAccount();
		da.deposit(400);
		
		th.transfer(100, da);
		
		System.out.println("Th " + th.getBalance());
		System.out.println("Th " + da.getBalance());
	}
}
