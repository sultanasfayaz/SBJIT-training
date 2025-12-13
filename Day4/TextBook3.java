package day4;


public class TextBook3 extends Book3 {
 private String subject;

 public TextBook3(String title, String author, double price, String subject) {
     super(title, author, price);
     this.subject = subject;
 }


 public String getBookType() {
     return "TextBook - Subject: " + subject;
 }
}

