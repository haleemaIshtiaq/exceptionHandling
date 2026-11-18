package se.lexicon;

public class Exercise3 {
    //Task:
    //Define a custom exception InsufficientBalanceException that is thrown when a withdrawal amount exceeds the account balance.
    //
    //Implement a simple banking system that allows deposits and withdrawals, and handles the custom exception appropriately.
    //
    //Hint:
    //Create a BankAccount class and handle the custom exception using throw and throws.
    void main(){
       try {
           BankAccount account1 = new BankAccount(10001, 5000);

           IO.println("Initial balance: " +account1.getBalance());
           double deposit = Double.parseDouble(IO.readln("Enter the amount to deposit: "));
           double balance = account1.deposit(deposit);
           IO.println("New balance after deposit: " + balance);


           double withdraw = Double.parseDouble(IO.readln("Enter the amount to withdraw: "));
           balance = account1.withdraw(withdraw);
           IO.println("New balance after withdraw: " + balance);




       }catch(IllegalArgumentException| InsufficientBalanceException e){
           IO.println(e.getMessage());
       }

    }
}
