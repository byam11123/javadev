// Main.java
public class Main {
    public static void main(String[] args) {
        // Create library
        Library library = new Library("City Central Library");
        
        // Create books
        Book book1 = new Book("ISBN001", "Java Programming", "John Smith");
        Book book2 = new Book("ISBN002", "Data Structures", "Jane Doe");
        Book book3 = new Book("ISBN003", "Algorithms", "Robert Johnson");
        
        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        // Create users
        User user1 = new User("U001", "Alice");
        User user2 = new User("U002", "Bob");
        
        // Register users
        library.registerUser(user1);
        library.registerUser(user2);
        
        System.out.println("\n=== Testing Book Issue & Return ===\n");
        
        // Issue book to user
        library.issueBook("ISBN001", user1);
        
        // Try to issue same book again (should fail)
        library.issueBook("ISBN001", user2);
        
        // Issue another book
        library.issueBook("ISBN002", user2);
        
        // Display all books
        library.displayAllBooks();
        
        // Return book
        library.returnBook("ISBN001", user1);
        
        // Display all books after return
        library.displayAllBooks();
        
        // Display users
        library.displayAllUsers();
    }
}