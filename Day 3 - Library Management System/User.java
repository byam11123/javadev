import java.util.ArrayList;
import java.util.List;

public class User{
    // Encapsulation: Private attributes
    private String userId;
    private String name;
    private List<Book> issuedBooks;

    // Constructor
    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    // Getters
    public String getUserId(){
        return userId;
    }

    public String getName(){
        return name;
    }

    public List<Book> getIssuedBooks(){
        return issuedBooks;
    }

    // Method to add issued book
    public void addIssuedBook(Book book) {
        issuedBooks.add(book);
    }

    // Method to remove returned book
    public void removeIssuedBook(Book book){
        issuedBooks.remove(book);
    }

    // Method to display user info
    public void displayInfo(){
        System.out.println("User ID: "+ userId);
        System.out.println("Name: "+ name);
        System.out.println("Books Issued: "+ issuedBooks.size());
        System.out.println("-------------------------");

    }
}

