import java.util.ArrayList;

public class Account {
    
    private long accountNumber;        // Unique account number
    private String name;               // Account holder's name
    private double balance;            // Current balance in the account
    private ArrayList<String> transactionHistory;  // List to store transaction history

    // Constructor to initialize the account with account number and holder's name
    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;  // Initial balance is 0.0
        this.transactionHistory = new ArrayList<>();
        addTransaction("Account created with initial balance: Rs 0.0");
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;  // Increase balance by deposit amount
            addTransaction("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;  // Decrease balance by withdrawal amount
            addTransaction("Withdrew: Rs " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Private helper method to add a transaction entry to the transaction history
    private void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    // Method to display account details including balance and transaction history
    public void getDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: Rs " + balance);
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Getter method for account number
    public long getAccountNumber() {
        return accountNumber;
    }
}
