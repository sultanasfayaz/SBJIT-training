package day4;

public class CurrentAccount2 extends Account2 {
 private double overdraftLimit;

 public CurrentAccount2(String accountNumber, double balance, double overdraftLimit) {
	 super(accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 public void withdraw(double amount) {
     if (amount <= balance + overdraftLimit) {
         balance -= amount;
         System.out.println(amount + " withdrawn with overdraft facility.");
     } else {
         System.out.println("Overdraft limit exceeded! Cannot withdraw.");
     }
 }
}
