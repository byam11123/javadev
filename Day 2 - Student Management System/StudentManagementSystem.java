import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        while(true){
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ADD
    static void addStudent(){
        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, marks));
        System.out.println("Student Added Successfully!");
    }

    // VIEW
    static void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No records found.");
            return;
        }
        for (Student s : students){
            s.display();
        }
    }

    // UPDATE
    static void updateStudent(){
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for(Student s: students){
            if(s.getId() == id){
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());

                System.out.println("Student Updated!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // DELETE
    static void deleteStudent(){
        System.out.print("enter ID to delete: ");
        int id = sc.nextInt();

        students.removeIf(s -> s.getId() == id);
        System.out.println("Student Deleted (if existed).");
    }
}
