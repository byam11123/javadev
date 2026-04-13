// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;
    private List<User> users;
    
    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    
    // Add book to library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    
    // Register user
    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }
    
    // Issue book to user
    public boolean issueBook(String isbn, User user) {
        Book bookToIssue = findBookByIsbn(isbn);
        
        if (bookToIssue == null) {
            System.out.println("Book not found!");
            return false;
        }
        
        if (bookToIssue.isIssued()) {
            System.out.println("Book is already issued!");
            return false;
        }
        
        // Issue the book
        bookToIssue.setIssued(true);
        user.addIssuedBook(bookToIssue);
        
        System.out.println("Book issued successfully!");
        System.out.println("Book: " + bookToIssue.getTitle());
        System.out.println("To: " + user.getName());
        return true;
    }
    
    // Return book
    public boolean returnBook(String isbn, User user) {
        Book bookToReturn = findBookByIsbn(isbn);
        
        if (bookToReturn == null) {
            System.out.println("Book not found!");
            return false;
        }
        
        if (!bookToReturn.isIssued()) {
            System.out.println("Book was not issued!");
            return false;
        }
        
        // Return the book
        bookToReturn.setIssued(false);
        user.removeIssuedBook(bookToReturn);
        
        System.out.println("Book returned successfully!");
        System.out.println("Book: " + bookToReturn.getTitle());
        return true;
    }
    
    // Find book by ISBN
    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    
    // Display all books
    public void displayAllBooks() {
        System.out.println("\n=== All Books in " + name + " ===");
        for (Book book : books) {
            book.displayInfo();
        }
    }
    
    // Display all users
    public void displayAllUsers() {
        System.out.println("\n=== All Registered Users ===");
        for (User user : users) {
            user.displayInfo();
        }
    }
}