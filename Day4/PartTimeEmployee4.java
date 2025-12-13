package day4;

public class PartTimeEmployee4 extends Employee4 {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee4(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
