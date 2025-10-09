import java.util.Scanner;

// Class for user's Bank Account
class BankAccount {
    private double balance;

    // Constructor (initial balance)
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println(" Invalid withdrawal amount!");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println(" Current Balance: ₹" + balance);
    }
}

// Main ATM class
public class codesofttask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Starting balance ₹5000

        System.out.println("=== Welcome to Saru's ATM ===");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("🙏 Thank you for using Saru's ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("⚠ Invalid choice! Please try again.");
            }
        }
    }
}
