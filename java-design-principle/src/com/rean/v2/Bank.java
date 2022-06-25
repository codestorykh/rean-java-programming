package com.rean.v2;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Bank {

    private final HashMap<Integer, Double> accounts = new HashMap<>();
    private int nextAccount = 0;
    public int newAccount() {
        int acct = ++nextAccount;
        accounts.put(acct, 0d);
        return acct;
    }

    public double getBalance(int acct) {
        Double balance = accounts.get(acct);
        if(null != balance)
            return balance;
        return 0.000;
    }

    public void deposit(int acct, double amt) {
        Double balance = accounts.get(acct);
        if(null == balance)
            this.logAccountNotFound(acct);
        else
            accounts.put(acct, balance + amt);
    }

    public boolean authorizeLoan(int acct, double loanAmount) {
        Double balance = accounts.get(acct);
        if(Objects.nonNull(balance))
            return balance >= loanAmount / 2d;
        this.logAccountNotFound(acct);
        return false;
    }
    public String showAccounts() {
        Set<Integer> accountList = accounts.keySet();
        StringBuilder result = new StringBuilder("The bank has " + accountList.size()
                + " accounts.");
        for (int i : accountList)
            result.append("\n\tBank account ")
                    .append(i).append(": balance = ")
                    .append(accounts.get(i));
        return result.toString();
    }
    public void addInterest() {
        Set<Integer> accountList = accounts.keySet();
        double rate = 0.02;
        for (int acct : accountList) {
            double balance = accounts.get(acct);
            double newBalance = balance * (1 + rate);
            accounts.put(acct, newBalance);
        }
    }
    public void logAccountNotFound(int acct) {
        System.out.println("Account " + acct + " not found!");
    }

}
