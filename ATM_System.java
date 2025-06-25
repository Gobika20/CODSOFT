import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            return true;
        }
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        } else {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            return true;
        }
    }
}
class ATM_Machine {
    private BankAccount account;
    private Scanner scanner;

    public ATM_Machine(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 4);
    }
}

public class ATM_System {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM_Machine atmMachine = new ATM_Machine(userAccount);

        atmMachine.showMenu(); 
    }
}

