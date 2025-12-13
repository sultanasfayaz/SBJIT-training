package day4;

public class Account2 {
 protected String accountNumber;
 protected double balance;

 public Account2(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println(amount + " deposited.");
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println(amount + " withdrawn.");
     } else {
         System.out.println("Insufficient balance!");
     }
 }

 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: " + balance);
 }
}
