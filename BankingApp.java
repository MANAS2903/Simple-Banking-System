import java.util.Scanner;  // Add this import

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Banking System");

        // Account creation
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a unique account number: ");
        Long accountNumber = scanner.nextLong();
        
        // Create an Account object and initialize Transaction
        Account account = new Account(accountNumber, name);
        Transaction transaction = new Transaction(account);

        boolean runApp = true;
        while (runApp) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Option: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value for the option.");
                scanner.next(); // Clear the buffer
                continue; // Go back to the menu
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    transaction.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    transaction.withdraw(withdrawAmount);
                    break;
                case 3:
                    transaction.displayDetails();
                    break;
                case 4:
                    runApp = false;
                    System.out.println("Thank you for using the banking system.");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }
}
