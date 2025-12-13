package day5;

class BookNotFoundException extends Exception {
	BookNotFoundException(String message) {
        super(message);
    }
}

class Book {
	private int bookid;
	private String title;
	public Book(int bookid, String title) {
		this.bookid=bookid;
		this.title=title;
	}
	public int getbookid() {
		return bookid;
	}
	public String gettitle() {
		return title;
	}
	public String toString() {
		return "book id:"+bookid+" title:"+title;
	}
}

public class LibraryBookSearch4 {
	public static void main(String[] args) {
		Book[] books=new Book[3];
		books[0]=new Book(1,"Wings of Fire");
		books[1]=new Book(2,"1947");
		books[2]=new Book(3,"Alladin");
	
		try {
            searchBookByTitle(books, "1947");  // Change title to test
            searchBookByTitle(books, "Harry Potter"); // This will throw exception
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void searchBookByTitle(Book[] books, String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book.gettitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
    
        throw new BookNotFoundException("Book with title \"" + title + "\" not found.");
    }
}
