package day4;

public class AbstractClass {
    public static void main(String[] args) {
        Employee5 manager1 = new Manager5("Alice", 101, 5000.0);
        Employee5 developer1 = new Developer5("Bob", 102, 160, 25.0);

        Employee5[] employees = { manager1, developer1 };

        for (Employee5 emp : employees) {
            emp.displayInfo();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("---------------------");
        }
    }
}

