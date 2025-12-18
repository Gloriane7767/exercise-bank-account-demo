package com.gloriane;

// =======================Exercise 1====================
    // Fields
public class BankAccount {
    private String accountHolder;
    private double balance;

    // Parameterized Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        setAccountHolder(accountHolder);
        setBalance(initialBalance);
        // deposit(balance) this is the initial amount in the account
    }
    // Getter/Setter
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        // return balance;
    }

    // Methods
    public double showBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{accountHolder='" + accountHolder + "', balance=" + balance + "}";
    }
}