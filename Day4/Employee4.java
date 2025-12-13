package day4;

public abstract class Employee4 {
    protected String name;
    protected int id;

    public Employee4(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Polymorphic method
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
