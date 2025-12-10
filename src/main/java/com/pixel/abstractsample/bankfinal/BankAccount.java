package com.pixel.abstractsample.bankfinal;

// Final abstract class - cannot be extended by any other class
public abstract class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    protected double balance;

    // Constructor is protected - only subclasses in same package can initialize
    protected BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Abstract methods that must be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract double calculateInterest();

    // Final concrete methods - cannot be overridden
    public final String getAccountNumber() {
        return accountNumber;
    }

    public final String getAccountHolder() {
        return accountHolder;
    }

    public final double getBalance() {
        return balance;
    }

    // Final concrete method for common validation
    protected final boolean validateAmount(double amount) {
        return amount > 0;
    }

    // Final method that provides a template for transaction logging
    protected final void logTransaction(String transactionType, double amount) {
        System.out.printf("[Transaction] %s: $%.2f on Account: %s%n",
                transactionType, amount, accountNumber);
    }
}

// Concrete implementations - defined in the SAME package
final class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100.0;
    private double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (validateAmount(amount)) {
            balance += amount;
            logTransaction("DEPOSIT", amount);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (validateAmount(amount) && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            logTransaction("WITHDRAWAL", amount);
            return true;
        }
        return false;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

final class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (validateAmount(amount)) {
            balance += amount;
            logTransaction("DEPOSIT", amount);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (validateAmount(amount) && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            logTransaction("WITHDRAWAL", amount);
            return true;
        }
        return false;
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically don't earn interest or earn minimal interest
        return balance * 0.01; // 1% interest
    }
}
// Usage example
class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV001", "John Doe", 1000.0, 3.5);
        CurrentAccount current = new CurrentAccount("CUR001", "Jane Smith", 500.0, 1000.0);

        savings.deposit(500.0);
        savings.withdraw(200.0);
        System.out.println("Savings Interest: $" + savings.calculateInterest());

        current.withdraw(1200.0); // Within overdraft limit
        System.out.println("Current Balance: $" + current.getBalance());
    }
}