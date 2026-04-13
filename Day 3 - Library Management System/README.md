# 📚 Library Management System

## Objective
Develop a Library Management System using Object-Oriented Programming (OOP) principles in Java. This system demonstrates core OOP concepts through a practical application that manages books, users, and book transactions.

## 🎯 Features
- ✅ Add books to library (with ISBN, title, author)
- ✅ Register users to the system
- ✅ Issue books to users (with availability checking)
- ✅ Return books from users
- ✅ Display all books with availability status
- ✅ Display all registered users with issued book count
- ✅ Track book availability in real-time
- ✅ Prevent duplicate issuing of the same book

## 🏗️ OOP Concepts Used

### 1. **Encapsulation** 🔒
**Definition:** Bundling data and methods that operate on that data within a single unit, while restricting direct access to internal state.

**Implementation:**
- All attributes in `Book`, `User`, and `Library` classes are declared as `private`
- Public getters and setters provide controlled access to private fields
- Example: `Book` class has private `isbn`, `title`, `author`, and `isIssued` with public getter methods

```java
// Book.java - Encapsulation Example
private String isbn;
private String title;
private boolean isIssued;

public String getIsbn() {
    return isbn;
}

public void setIssued(boolean issued) {
    isIssued = issued;
}
```

### 2. **Abstraction** 🎭
**Definition:** Hiding complex implementation details and exposing only essential features to the user.

**Implementation:**
- Complex data structures (ArrayList) are hidden from end users
- Simple, intuitive methods like `issueBook()`, `returnBook()`, `displayInfo()` abstract internal logic
- Users don't need to know how books are stored or searched internally
- The `findBookByIsbn()` method is private - implementation detail hidden from outside

```java
// Library.java - Abstraction Example
// Complex ArrayList search logic is hidden
private Book findBookByIsbn(String isbn) {
    for (Book book : books) {
        if (book.getIsbn().equals(isbn)) {
            return book;
        }
    }
    return null;
}

// Simple public interface
public boolean issueBook(String isbn, User user) {
    // Complex logic abstracted away
}
```

### 3. **Composition (HAS-A Relationship)** 🔗
**Definition:** A design principle where a class contains references to objects of other classes.

**Implementation:**
- **Library HAS-A** List of Books (`List<Book> books`)
- **Library HAS-A** List of Users (`List<User> users`)
- **User HAS-A** List of Issued Books (`List<Book> issuedBooks`)
- This creates a flexible, modular design

```java
// Library.java - Composition
private List<Book> books;        // Library HAS-A books
private List<User> users;        // Library HAS-A users

// User.java - Composition
private List<Book> issuedBooks;  // User HAS-A issued books
```

### 4. **Polymorphism** 🔄
**Definition:** The ability of different objects to respond to the same method call in their own unique way.

**Implementation:**
- The `displayInfo()` method behaves differently in `Book` and `User` classes
- In `Book`: Displays ISBN, title, author, and availability status
- In `User`: Displays user ID, name, and count of issued books
- Same method name, different implementations (method behavior varies based on object type)

```java
// Book.java - Polymorphism
public void displayInfo() {
    // Shows book-specific information
    System.out.println("ISBN: " + isbn);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
}

// User.java - Polymorphism
public void displayInfo() {
    // Shows user-specific information
    System.out.println("User ID: " + userId);
    System.out.println("Name: " + name);
    System.out.println("Books Issued: " + issuedBooks.size());
}
```

## 📊 Class Structure

### Book Class
- **Attributes:** `isbn`, `title`, `author`, `isIssued`
- **Methods:** Getters, setters, `displayInfo()`

### User Class
- **Attributes:** `userId`, `name`, `issuedBooks` (List)
- **Methods:** Getters, `addIssuedBook()`, `removeIssuedBook()`, `displayInfo()`

### Library Class
- **Attributes:** `name`, `books` (List), `users` (List)
- **Methods:** `addBook()`, `registerUser()`, `issueBook()`, `returnBook()`, `displayAllBooks()`, `displayAllUsers()`

### Main Class
- **Purpose:** Entry point demonstrating all functionality
- **Tests:** Book issuing, returning, edge cases

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line/terminal access

### Steps

1. **Navigate to the project directory:**
```bash
cd "Day 3 - Library Management System"
```

2. **Compile all Java files:**
```bash
javac *.java
```

3. **Run the program:**
```bash
java Main
```

### Expected Output
```
Book added: Java Programming
Book added: Data Structures
Book added: Algorithms
User registered: Alice
User registered: Bob

=== Testing Book Issue & Return ===

Book issued successfully!
Book: Java Programming
To: Alice
Book is already issued!
Book issued successfully!
Book: Data Structures
To: Bob

=== All Books in City Central Library ===
ISBN: ISBN001
Title: Java Programming
Author: John Smith
Status: Issued
-------------------------
ISBN: ISBN002
Title: Data Structures
Author: Jane Doe
Status: Issued
-------------------------
ISBN: ISBN003
Title: Algorithms
Author: Robert Johnson
Status: Available
-------------------------

Book returned successfully!
Book: Java Programming

=== All Books in City Central Library ===
ISBN: ISBN001
Title: Java Programming
Author: John Smith
Status: Available
-------------------------
...

=== All Registered Users ===
User ID: U001
Name: Alice
Books Issued: 0
-------------------------
User ID: U002
Name: Bob
Books Issued: 1
-------------------------
```

## 📁 Project Structure
```
Day 3 - Library Management System/
├── Book.java           # Book class with encapsulation
├── User.java           # User class with issued books tracking
├── Library.java        # Library management with composition
├── Main.java           # Main entry point demonstrating features
└── README.md           # This file
```

## 🔍 OOP Interview Questions & Answers

### Q1: What is abstraction?
**A:** Abstraction is hiding complex implementation details and showing only essential features. In this project, we use private attributes with public methods, and hide the internal ArrayList operations from users.

### Q2: Interface vs Abstract class?
**A:** 
- **Interface:** 100% abstract, supports multiple inheritance, cannot have method implementations (before Java 8)
- **Abstract class:** Can have both abstract and concrete methods, single inheritance only

### Q3: Give a polymorphism example from this code?
**A:** The `displayInfo()` method behaves differently in `Book` (shows book details) and `User` (shows user details) classes.

### Q4: What is method overriding?
**A:** When a child class redefines a parent class method with the same signature to provide specific implementation.

### Q5: Explain IS-A vs HAS-A relationships?
**A:** 
- **IS-A:** Inheritance relationship (e.g., Student IS-A Person)
- **HAS-A:** Composition relationship (e.g., Library HAS-A Book, User HAS-A List)

### Q6: Why use inheritance?
**A:** Code reusability, method overriding, and establishing relationships between classes.

### Q7: What is dynamic binding?
**A:** Method calls are resolved at runtime rather than compile time, enabling polymorphism.

### Q8: What is constructor chaining?
**A:** When a constructor calls another constructor using `this()` or parent constructor using `super()`.

### Q9: How to implement encapsulation?
**A:** Make attributes private and provide public getters/setters to control access.

### Q10: What is the super keyword?
**A:** Refers to the parent class object; used to access parent class methods and constructors.

## 💡 Future Enhancements
- Add search functionality (by title, author)
- Implement due dates and fine calculation
- Add book categories/genres
- Implement user borrowing limits
- Add persistence (file I/O or database)
- Create a GUI interface
- Add admin and regular user roles with inheritance

## 📝 Key Takeaways
- **Encapsulation** protects data integrity
- **Abstraction** simplifies complex systems
- **Composition** creates flexible relationships
- **Polymorphism** enables code extensibility
- All four OOP pillars work together to create maintainable, scalable code

## 👨‍💻 Author
Developed as part of Java Development Internship - Day 3 Task

## 📅 Deadline
Same day, 10:00 PM
