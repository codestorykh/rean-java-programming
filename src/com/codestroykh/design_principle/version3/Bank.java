package com.codestroykh.design_principle.version3;

import java.util.HashMap;

public class Bank {
    private final HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private int nextAccount = 0;

    public int newAccount(boolean resident) {
        int account = ++nextAccount;
        BankAccount bankAccount = new BankAccount(account);
        bankAccount.setResident(resident);
        accounts.put(account, bankAccount);
        return account;
    }

    public double getBalance(int accountNo) {
        BankAccount bankAccount = accounts.get(accountNo);
        return bankAccount.getBalance();
    }

    public void deposit(int accountNo, double amount) {
        BankAccount bankAccount = accounts.get(accountNo);
        double balance = bankAccount.getBalance();
        bankAccount.setBalance(balance + amount);
    }

    public void setResident(int accountNo, boolean resident) {
        BankAccount ba = accounts.get(accountNo);
        ba.setResident(resident);
    }

    public boolean loan(int accountNo, double amount) {
        BankAccount bankAccount = accounts.get(accountNo);
        double balance = bankAccount.getBalance();
        return balance >= amount / 2;
    }

    public String showAccounts() {
        StringBuilder result = new StringBuilder("The bank has " + accounts.size()
                + " accounts.");
        for (BankAccount bankAccount : accounts.values())
            result.append("\n\tBank account ")
                    .append(bankAccount.getAccountNo())
                    .append(": balance=")
                    .append(bankAccount.getBalance())
                    .append(", is ")
                    .append(bankAccount.isResident() ? "resident" : "non-resident");
        return result.toString();
    }

    public void addInterest() {
        double rate = 0.02;
        for (BankAccount bankAccount : accounts.values()) {
            double balance = bankAccount.getBalance();
            balance += balance * rate;
            bankAccount.setBalance(balance);
        }
    }

}
