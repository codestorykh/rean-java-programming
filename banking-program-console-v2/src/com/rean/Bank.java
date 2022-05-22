package com.rean;


import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Bank {

    private final HashMap<Integer, Double> accounts = new HashMap<>();
    private int nextAccount = 0;

    public int newAccount() {
        int account = ++nextAccount;
        accounts.put(account, 0d);
        return account;
    }

    public double getBalance(int account) {
        return accounts.get(account);
    }

    public void deposit(int account, double amount) {
        Double balance = accounts.get(account);
        if(null == balance) {
            this.logAccountNotFound(account);
        }else
            accounts.put(account, balance + amount);
    }

    public boolean loan(int account, double amount) {
        Double balance = accounts.get(account);
        if(Objects.nonNull(balance))
            return balance >= amount / 2d;
        this.logAccountNotFound(account);
        return false;
    }

    public void addInterest() {
        Set<Integer> accountList = accounts.keySet();
        double rate = 0.02;
        for(int acct : accountList) {
            double balance = accounts.get(acct);
            double newBalance = balance *(1 + rate);
            accounts.put(acct, newBalance);
        }
    }

    public String showAllAccounts() {
        Set<Integer> accountList = accounts.keySet();
        StringBuilder stringBuilder= new StringBuilder("The bank has " +
                accountList.size()+ " accounts. ");

        for(int acct : accountList)
            stringBuilder.append("\n\t Bank account ")
                    .append(acct).append(": balance = ")
                    .append(accounts.get(acct));
        return stringBuilder.toString();
    }

    public void logAccountNotFound(int account) {
        System.out.println("Account " + account + " not found!");
    }
}
