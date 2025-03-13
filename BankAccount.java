//java program to demonstrate encapsulation

public class BankAccount {
 private double balance;
 
 //public method to deposit money
 public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
     System.out.println("Deposited: " + amount);   
}
 }

 //public method to withdraw money
 public void withdraw(double amount) {
    if (amount > balance) {
     System.out.println("Insufficient funds,withdrawal denied: " );
    }
    else if (amount >0) {
        balance -= amount;
    System.out.println("withdraw: " + amount);
    }
    else{
        System.out.println("withdrawal amount must be positive");
    }
    }
    
//public getter method to access balance
public double getBalance(){
    return balance;
}
}
