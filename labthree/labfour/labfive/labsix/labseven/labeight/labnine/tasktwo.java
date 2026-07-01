// Lab Nine Task 2
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display account info securely
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankEncapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Setting values using setters
        account.setAccountHolder("Istiak Khan");
        account.setAccountNumber(253051);
        account.setBalance(50000.75);

        // Displaying account information
        account.displayAccountInfo();
    }
}
