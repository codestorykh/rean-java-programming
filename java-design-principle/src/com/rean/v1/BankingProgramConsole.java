package com.rean.v1;

import com.rean.ConsoleColors;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BankingProgramConsole {

    private final HashMap<Integer, Double> account = new HashMap<>();
    private int nextAccount = 0;
    private int current = 0;
    private Scanner scanner;
    private boolean stop = false;


    public static void main(String[] args) {
        BankingProgramConsole banking = new BankingProgramConsole();
        banking.run();
    }

    private void run() {
        scanner = new Scanner(System.in);
        while (!stop) {
            System.out.println();
            System.out.println("Enter command ("
            + ConsoleColors.RED_BRIGHT + " 0 = Quit " + ConsoleColors.RESET
            + ConsoleColors.GREEN_BRIGHT + " 1 = New Account " + ConsoleColors.RESET
            + ConsoleColors.PURPLE_BRIGHT + " 2 = Select Account " + ConsoleColors.RESET
            + ConsoleColors.YELLOW_BRIGHT + " 3 = Deposit " + ConsoleColors.RESET
            + ConsoleColors.CYAN_BRIGHT + " 4 = Loan " + ConsoleColors.RESET
            + ConsoleColors.WHITE_BRIGHT + " 5 = Add Interest " + ConsoleColors.RESET
            + ConsoleColors.BLUE_BRIGHT + " 6 = Show All Account :) " + ConsoleColors.RESET );

            int command = scanner.nextInt();
            this.processingCommand(command);
        }
        scanner.close();
    }

    public void processingCommand(int command) {
        switch (command){
            case 0 -> closeProgram();
            case 1 -> newAccount();
            case 2 -> selectAccount();
            case 3 -> deposit();
            case 4 -> loan();
            case 5 -> addInterest();
            case 6 -> showAllAccounts();
            default -> System.out.println("Command invalid!");
        }
    }

    public void newAccount() {
        current = ++nextAccount;
        account.put(current, 0d);
        System.out.println("Your new account number is : " + current);
    }

    public void selectAccount() {
        System.out.println("Enter your account number: ");
        current = scanner.nextInt();
        Double balance = account.get(current);
        if(null == balance)
            System.out.println("Account not found: " + current);
        else
            System.out.println("The balance of account " + current
             + " is " + balance);
    }

    public void deposit() {
        System.out.println("Enter amount you want to deposit: ");
        double amount = scanner.nextDouble();
        Double balance = account.get(current);
        if(null == balance) {
            System.out.println("Please select the account you want to deposit.");
        }else {
            account.put(current, amount + balance);
        }
    }

    public void loan() {
        System.out.println("Enter loan amount: ");
        double amount = scanner.nextDouble();
        Double balance = account.get(current);
        if(null == balance) {
            System.out.println("Please select the account you want to loan.");
        }else {
            if(amount <= 50)
                System.out.println("Your loan is approved.");
            else
                System.out.println("Your loan is denied.");
        }
    }

    public void addInterest() {
        double rate = 0.02;
        Set<Integer> accounts = this.account.keySet();
        if(accounts.isEmpty())
            System.out.println("No account found!");
        else
            for(Integer acc : accounts) {
                double balance = this.account.get(acc);
                double newBalance = balance * (1 + rate);
                this.account.put(acc, newBalance);
            }
    }

    public void showAllAccounts() {
        Set<Integer> accounts = this.account.keySet();
        if(accounts.isEmpty())
            System.out.println("No account found!");
        else
            for(Integer acc : accounts) {
                System.out.println("Bank account " + acc +
                        ": balance = " + this.account.get(acc));
            }
    }

    public void closeProgram() {
        stop = true;
        System.out.println("Thank you for using services our banking!");
    }

}