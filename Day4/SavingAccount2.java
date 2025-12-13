package day4;

public class SavingAccount2 extends Account2 {
 private double interestRate;

 public SavingAccount2(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 public void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: " + interest);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal denied! Insufficient funds in Savings Account.");
     }
 }
}
