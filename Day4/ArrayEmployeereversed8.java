package day4;

class Employee8 {
    private String name;

    // Constructor
    public Employee8(String name) {
        this.name = name;
    }

    // Method to reverse the name
    public String reverseName() {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        return reversed;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

public class ArrayEmployeereversed8 {
    public static void main(String[] args) {
       
        Employee8[] employees = {
            new Employee8("Rahul"),
            new Employee8("Anita"),
            new Employee8("Vikram"),
            new Employee8("Sonia")
        };

       
        for (Employee8 employee : employees) {
            System.out.println("Original Name : " + employee.getName());
            System.out.println("Reversed Name : " + employee.reverseName());
            System.out.println("----------------------");
        }
    }
}

