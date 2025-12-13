package day4;


public class Novel3 extends Book3 {
 private String genre;

 public Novel3(String title, String author, double price, String genre) {
     super(title, author, price);
     this.genre = genre;
 }

 public String getBookType() {
     return "Novel - Genre: " + genre;
 }
}
