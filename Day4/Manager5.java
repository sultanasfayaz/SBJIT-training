package day4;

public class Manager5 extends Employee5 {
   private double monthlySalary;
   public Manager5(String name, int employeeId,double monthlySalary) {
	   super(name,employeeId);
	   this.monthlySalary=monthlySalary;
   }
  
   public double calculateSalary() {
       return monthlySalary;
   }
}
