abstract class BankAccount {
    private int accountNumber;
    double balance;
    protected static double interestRate;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    public void display() {
        System.out.println("Account No: " +accountNumber);
        System.out.println("Balance: " +balance);
        System.out.println("Interest Rate: " +interestRate + " %");
        System.out.println("Calculated Interest: " +calculateInterest());
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount.setInterestRate(10);
        SavingsAccount sa = new SavingsAccount(104149, 1000000);
        sa.display();
    }
}