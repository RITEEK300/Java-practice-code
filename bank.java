import java.util.Scanner;

class bank {
    private double balance = 50000.456;
    private int password = 123;

    public void deposit() {
        System.out.println("Enter your password:");
        Scanner scanner = new Scanner(System.in);
        int inputPassword = scanner.nextInt();

        if (inputPassword == password) {
            System.out.println("Enter your deposit amount:");
            double amount = scanner.nextDouble();
            balance += amount;
            System.out.println("Your current bank balance = " + balance);
        } else {
            System.out.println("Wrong password");
        }
    }

    public void withdraw() {
        System.out.println("Enter your password:");
        Scanner scanner = new Scanner(System.in); // Create a new scanner
        int inputPassword = scanner.nextInt();

        if (inputPassword == password) {
            System.out.println("Enter your withdraw amount:");
            double amount = scanner.nextDouble();
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Your current bank balance = " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Wrong password");
        }
    }

    public void balance() {
        System.out.println("Enter your password:");
        Scanner scanner = new Scanner(System.in); // Create a new scanner
        int inputPassword = scanner.nextInt();

        if (inputPassword == password) {
            System.out.println("Your current bank balance = " + balance);
        } else {
            System.out.println("Wrong password");
        }
    } 

    public static void main(String[] args) {
        bank bank = new bank();
        int choice;

        System.out.println("Welcome to the Bank of India. Please select an option:");

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("Enter your choice:");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bank.deposit();
                break;
            case 2:
                bank.withdraw();
                break;
            case 3:
                bank.balance();
                break;
            default:
                System.out.println("Invalid choice");
        }

        
    }
}
