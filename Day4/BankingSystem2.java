package day4;

//BankMain.java
public class BankingSystem2 {
 public static void main(String[] args) {
     SavingAccount2 savingaccount = new SavingAccount2("SA1001", 5000, 5);
     CurrentAccount2 currentaccount = new CurrentAccount2("CA2001", 3000, 2000);

     System.out.println("=== Savings Account Operations ===");
     savingaccount.deposit(1000);
     savingaccount.withdraw(2000);
     savingaccount.addInterest();
     savingaccount.displayBalance();

     System.out.println("\n=== Current Account Operations ===");
     currentaccount.deposit(2000);
     currentaccount.withdraw(6000);  // overdraft example
     currentaccount.displayBalance();
 }
}
