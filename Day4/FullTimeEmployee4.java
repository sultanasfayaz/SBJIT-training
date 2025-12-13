package day4;

public class FullTimeEmployee4 extends Employee4 {
    private double monthlySalary;

    public FullTimeEmployee4(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
