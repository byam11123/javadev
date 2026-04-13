public class Book {
    // Encapsulation:Private attributes
    private String isbn;
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters and Setters (Encapsulation)
    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isIssued(){
        return isIssued;
    }

    public void setIssued(boolean issued){
        isIssued = issued;
    }

    // Method to display book info
    public void displayInfo(){
        String status = isIssued ? "Issued":"Available";
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
        System.out.println("-------------------------");
    }
}