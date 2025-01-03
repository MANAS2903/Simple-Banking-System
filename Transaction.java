class Transaction {
    private Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void displayDetails() {
        account.getDetails();
    }
}
