package com.finance.banking.Atm;

public class Person {
    private String name;
    private int PIN;
    private BankAccount account; // instance of bank account object - Composite Association

    public Person(String name, int pin) {
        this.name = name;
        this.PIN = pin;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public int getPIN() {
        return PIN;
    }
}
