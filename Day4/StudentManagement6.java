package day4;


public class StudentManagement6 {
    public static void main(String[] args) {

        Student6 student6 = new Student6("Anita", 101, 85);
        student6.displayDetails();

        System.out.println("\nUpdating marks...");
        student6.setMarks(105);   // Invalid value
        student6.setMarks(95);    // Valid value

        System.out.println("\nAfter update:");
        student6.displayDetails();
    }
}
