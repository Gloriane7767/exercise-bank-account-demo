package com.gloriane;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", 500.0);
        BankAccount account3 = new BankAccount("Mike Johnson", 2500.0);

        System.out.println("Account Holder: " + account1.getAccountHolder() + ", Balance: $" + account1.getBalance());
        account1.deposit(200.0);
        account1.withdraw(150.0);

        System.out.println("\nAccount Holder: " + account2.getAccountHolder() + ", Balance: $" + account2.getBalance());
        account2.deposit(300.0);
        account2.withdraw(100.0);

        System.out.println("\nAccount Holder: " + account3.getAccountHolder() + ", Balance: $" + account3.getBalance());
        account3.deposit(500.0);
        account3.withdraw(750.0);
    }
}