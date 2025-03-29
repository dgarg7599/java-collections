package com.bridgelabz.bankingsystem;

import java.util.*;

class BankingSystem {
    private final Map<Integer, Double> accounts = new HashMap<>(); // AccountNumber -> Balance
    private final Queue<Integer> withdrawalQueue = new LinkedList<>(); // Queue for withdrawal requests

    // Adds a new customer account
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    // Deposits money into an account
    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    // Requests a withdrawal (added to queue)
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Processes all withdrawals in the queue
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                System.out.println("Withdrawal of $" + amount + " from Account " + accountNumber + " successful.");
            } else {
                System.out.println("Insufficient balance for Account " + accountNumber);
            }
        }
    }

    // Displays accounts sorted by balance
    public void displaySortedAccounts() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " - Balance: $" + entry.getKey());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(1001, 5000.00);
        bank.addAccount(1002, 2500.50);
        bank.addAccount(1003, 7800.75);

        // Depositing money
        bank.deposit(1001, 1000.00);
        bank.deposit(1002, 500.00);

        // Requesting withdrawals
        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1002);

        // Processing withdrawals
        bank.processWithdrawals(1200.00);

        // Display sorted accounts
        bank.displaySortedAccounts();
    }
}