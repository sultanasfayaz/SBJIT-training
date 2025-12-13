package day4;


class Developer5 extends Employee5 {
    private int hoursWorked;
    private double hourlyRate;

    public Developer5(String name, int employeeId, int hoursWorked, double hourlyRate) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

