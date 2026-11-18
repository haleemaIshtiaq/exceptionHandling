package se.lexicon;

public class BankAccount {
    private final int accountNumber;
    private double balance;


    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        deposit(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance = balance + amount;
        return balance;

    }

    public double withdraw(double amount) throws InsufficientBalanceException{
        if (amount <= 0){
            throw new IllegalArgumentException(" amount must be positive.");
        }
        if(balance< amount){
            throw new InsufficientBalanceException("Withdraw amount must be less than balance", balance, amount);
        }
        balance= balance - amount;
        return balance;

    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
