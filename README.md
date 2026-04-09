# ☕ Java Console Calculator - Task 1

> **Java Developer Internship Submission**  
> A command-line calculator that performs basic arithmetic operations using Java.

---

## 📋 Features

- ✅ **Addition** - Add two decimal numbers
- ✅ **Subtraction** - Subtract two decimal numbers
- ✅ **Multiplication** - Multiply two decimal numbers
- ✅ **Division** - Divide with zero-error handling
- ✅ **Input Validation** - Handles invalid choices and non-numeric inputs
- ✅ **Continuous Loop** - Perform multiple calculations until user exits
- ✅ **User-Friendly Menu** - Clear console-based UI

---

## 🛠️ Tools Used

| Tool | Version |
|------|---------|
| JDK | 21.0.10 |
| IDE | VS Code / Any Text Editor |
| Terminal | Git Bash / CMD |
| Version Control | GitHub |

---

## 🚀 How to Run

### Step 1: Clone the Repository
```bash
git clone https://github.com/poojarao09/Javacalculator.git
cd Javacalculator
```

### Step 2: Compile
```bash
javac Calculator.java
```

### Step 3: Run
```bash
java Calculator
```

---

## 📖 Program Flow

1. Program starts and displays the menu
2. User selects an operation (1-5)
3. User enters two numbers
4. Result is displayed
5. Program asks to press Enter to continue
6. Loop repeats until user chooses "Exit"

### Sample Output
```
=================================
   Welcome to Java Calculator!
=================================

=================================
   Select an Operation:
=================================
  1. Add
  2. Subtract
  3. Multiply
  4. Divide
  5. Exit
=================================
Enter your choice (1-5): 1
Enter first number: 40
Enter second number: 60

Result: 40.00 + 60.00 = 100.00

--- Press Enter to continue ---
```

---

## 💡 Key Concepts Applied

| Concept | Implementation |
|---------|----------------|
| **Methods** | Separate methods for `add`, `subtract`, `multiply`, `divide` |
| **Scanner** | Console input via `java.util.Scanner` |
| **Control Flow** | `switch` statement for operation routing |
| **Loops** | `while(true)` for continuous execution |
| **Validation** | `hasNextInt()` and `hasNextDouble()` checks |
| **Error Handling** | Division by zero check with error message |
| **Data Types** | `double` for decimal number support |

---

## 📂 Project Structure

```
Javacalculator/
├── Calculator.java      # Console-based calculator (Main submission)
├── calculatorUI.java    # Desktop GUI version (Bonus)
├── calculator.html      # Web-based version (Bonus)
├── .gitignore           # Excludes .class files from repo
└── README.md            # This file
```

---

## 🎯 Pre-Submission Checklist

- [x] Calculator.java compiles without errors (`javac`)
- [x] All 4 arithmetic operations return correct results
- [x] Division by zero is handled gracefully
- [x] Program loops until user explicitly chooses to exit
- [x] Scanner is properly closed to avoid resource leaks
- [x] GitHub repo created with clear README.md
- [x] Code is well-commented and readable

---

## 🎤 Interview Prep - Key Learnings

### Q: What is method overloading?
**A:** Multiple methods with the same name but different parameters. (Not used here, but possible in Java)

### Q: How do you handle divide-by-zero?
**A:** Check if divisor is `0` before calling `divide()` method and print an error message.

### Q: Difference between `==` and `.equals()`?
**A:** `==` compares memory references (objects) or values (primitives), while `.equals()` compares actual content/values.

### Q: What are basic data types in Java?
**A:** `int`, `double`, `boolean`, `char`, `float`, `long`, `short`, `byte`

### Q: How is Scanner used for input?
**A:** `Scanner sc = new Scanner(System.in);` creates a reader for console input. Use `nextInt()`, `nextDouble()`, etc.

### Q: What is the JVM?
**A:** Java Virtual Machine - executes bytecode and makes Java platform-independent.

### Q: How is Java platform-independent?
**A:** Java compiles to `.class` (bytecode) which runs on JVM. Any OS with JVM can run it.

---

## 👨‍💻 Author

**Byamkesh Kaiwartya**  
Java Developer Intern

---

