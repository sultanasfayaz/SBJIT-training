package day4;

public class EmployeeManagement4 {
    public static void main(String[] args) {

        Employee4 emp1 = new FullTimeEmployee4("Alice", 101, 5000.0);
        Employee4 emp2 = new PartTimeEmployee4("Bob", 102, 80, 20.0);

        Employee4[] employees = {emp1, emp2};

        for (Employee4 emp : employees) {
            emp.displayInfo();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("---------------------");
        }
    }
}
