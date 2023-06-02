import java.util.Scanner;

public class CurrentAccount {
    private double balance;

    public CurrentAccount() {
        balance = 20000;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrentAccount bank = new CurrentAccount();

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be deposited: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    System.out.println("Deposited successfully.");
                    break;

                case 2:
                    System.out.print("Enter the amount for withdrawal: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successfully.");
                    break;

                case 3:
                    bank.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for accepting our service. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid action. Please try again.");
            }

            System.out.println();
        }
    }
}
