package day4;


public class LibrarySystem3 {
 public static void main(String[] args) {

     Book3 textbook = new TextBook3("Physics Fundamentals", "Dr. Watson", 450.0, "Physics");
     Book3 novels = new Novel3("The Silent Patient", "Alex Michaelides", 320.0, "Thriller");

     System.out.println("=== TextBook Details ===");
     textbook.displayDetails();

     System.out.println("\n=== Novel Details ===");
     novels.displayDetails();
 }
}
