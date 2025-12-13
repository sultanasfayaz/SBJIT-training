package day4;


class Student6 {

    // Private fields
    private String name;
    private int rollNo;
    private int marks;

    // Constructor
    public Student6(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        setMarks(marks);   // use setter for validation
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Setter with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}

