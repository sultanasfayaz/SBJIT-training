package day5;

class Student {
    int studentId;
    String name;
    int marks;

    Student(int studentId, String name, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class StudentNotFoundException extends Exception {
    StudentNotFoundException(String message) {
        super(message);
    }
}

public class StudentManagement1 {
    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "John", 80),
            new Student(2, "Mary", 90),
            new Student(3, "Alex", 75)
        };

        int searchId = 3;

        try {
            Student student = searchStudent(students, searchId);
            student.display();
        } catch (StudentNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static Student searchStudent(Student[] students, int id)
            throws StudentNotFoundException {

        for (Student student : students) {
            if (student.studentId == id)
                return student;
        }
        throw new StudentNotFoundException("Student ID not found");
    }
}
