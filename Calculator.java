import java.util.Scanner;


public class Calculator {

   
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("   Welcome to Java Calculator!");
        System.out.println("=================================\n");
        while (true) {
            displayMenu();
            int choice = getChoice();
            if (choice == 5) {
                System.out.println("\nThank you for using the calculator. Goodbye!");
                break;
            }

            // Perform the selected operation
            performOperation(choice);

            // Pause before showing menu again
            System.out.println("\n--- Press Enter to continue ---");
            try {
                scanner.nextLine(); // Consume leftover newline
                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // Wait for user to press Enter
                }
            } catch (Exception e) {
                // Ignore if no input available (e.g., piped input)
            }
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Displays the main menu of operations.
     */
    private static void displayMenu() {
        System.out.println("=================================");
        System.out.println("   Select an Operation:");
        System.out.println("=================================");
        System.out.println("  1. Add");
        System.out.println("  2. Subtract");
        System.out.println("  3. Multiply");
        System.out.println("  4. Divide");
        System.out.println("  5. Exit");
        System.out.println("=================================");
        System.out.print("Enter your choice (1-5): ");
    }

    /**
     * Reads and validates the user's menu choice.
     * Loops until a valid choice (1-5) is entered.
     *
     * @return A valid menu choice between 1 and 5
     */
    private static int getChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.print("Invalid choice! Please enter a number between 1 and 5: ");
                }
            } else {
                // Clear invalid input
                scanner.next();
                System.out.print("Invalid input! Please enter a number (1-5): ");
            }
        }
    }

    /**
     * Performs the selected arithmetic operation.
     *
     * @param choice The operation to perform (1-4)
     */
    private static void performOperation(int choice) {
        // Get two numbers from user
        double num1 = getNumber("Enter first number: ");
        double num2 = getNumber("Enter second number: ");

        double result;

        // Execute the chosen operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.printf("\nResult: %.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.printf("\nResult: %.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.printf("\nResult: %.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case 4:
                // Division requires special handling for divide-by-zero
                if (num2 == 0) {
                    System.out.println("\nError: Cannot divide by zero!");
                } else {
                    result = divide(num1, num2);
                    System.out.printf("\nResult: %.2f / %.2f = %.2f\n", num1, num2, result);
                }
                break;
            default:
                // This case should never happen due to validation in getChoice()
                System.out.println("\nInvalid operation selected.");
        }
    }

    /**
     * Reads a number from user input with validation.
     * Keeps asking until a valid number is entered.
     *
     * @param prompt The message to display to the user
     * @return A valid double value
     */
    private static double getNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                // Clear invalid input and ask again
                scanner.next();
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    /**
     * Adds two numbers.
     *
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    private static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts second number from first number.
     *
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    private static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    private static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides first number by second number.
     * NOTE: Caller should check for zero before calling this method.
     *
     * @param a Dividend
     * @param b Divisor (should not be zero)
     * @return Quotient of a divided by b
     */
    private static double divide(double a, double b) {
        return a / b;
    }
}
