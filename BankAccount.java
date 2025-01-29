package com.finance.banking.Atm;

public class BankAccount {
    private double balance;

    // constuctor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        }else {
            System.out.println("Insufficient funds or invalid amount entered.");
        }
    }
    // check balance
    public double getBalance() {
        return balance;
    }
}
