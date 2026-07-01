// Lab Ten Task 2
interface ATMService {
    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    // Constructor to initialize balance
    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Successfully: " + amount + " TK");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Successfully: " + amount + " TK");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance + " TK");
        System.out.println("----------------------------------");
    }
}

// Main class to test the implementation
public class ATMTest {
    public static void main(String[] args) {

        System.out.println("--- Welcome to DBBL ATM Service ---");

        // Creating object using interface reference
        ATMService myAccount = new DBBL(5000.0);

        // Performing ATM operations
        myAccount.checkBalance();

        myAccount.deposit(2000.0);
        myAccount.checkBalance();

        myAccount.withdraw(1500.0);
        myAccount.checkBalance();

        // Trying invalid withdrawal
        myAccount.withdraw(10000.0);
    }
}
