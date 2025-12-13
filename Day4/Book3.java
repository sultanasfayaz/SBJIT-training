package day4;


public class Book3 {
 protected String title;
 protected String author;
 protected double price;

 public Book3(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 public String getBookType() {
     return "General Book";
 }

 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: " + price);
     System.out.println("Type: " + getBookType());
 }
}

