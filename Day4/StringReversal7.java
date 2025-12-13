package day4;

class Employee {
    private String name;

    public Employee(String name) {
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
}

public class StringReversal7 {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul");

        System.out.println("Original Name : " + "Rahul");
        System.out.println("Reversed Name : " + employee.reverseName());
    }
}

