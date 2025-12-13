package day4;

class Account {
 protected double balance;

 public Account(double balance) {
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 public void displayBalance() {
     System.out.println("Balance: " + balance);
 }
}

class SavingAccount extends Account {
 public SavingAccount(double balance) {
     super(balance);
 }
}

class CurrentAccount extends Account {
 public CurrentAccount(double balance) {
     super(balance);
 }
}

public class BankingSystem {
 public static void main(String[] args) {

     SavingAccount savingaccount = new SavingAccount(1000);
     CurrentAccount currentaccount = new CurrentAccount(2000);

     System.out.println("****Saving Account****");
     savingaccount.deposit(500);
     savingaccount.withdraw(300);
     savingaccount.displayBalance();

     System.out.println("\n ****Current Account****");
     currentaccount.deposit(1000);
     currentaccount.withdraw(500);
     currentaccount.displayBalance();
 }
}
