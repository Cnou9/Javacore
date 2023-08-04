import Students.Manage;
import Students.Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Manage manage=new Manage();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. View all students");
            System.out.println("2. Add a new student");
            System.out.println("3. Update student's point");
            System.out.println("4. Remove a student");
            System.out.println("5. View students by class");
            System.out.println("6. Sort by name");
            System.out.println("7. Sort by age");
            System.out.println("8. Sort by point");
            System.out.println("0. Exit");

            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Read the new line after reading the integer input.

            switch (choice) {
                case 1 -> manage.viewAllStudents();
                case 2 -> {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Read the new line after reading the integer input.
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Read the new line after reading the integer input.
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter point: ");
                    double point = scanner.nextDouble();
                    scanner.nextLine(); // Read the new line after reading the double input.
                    System.out.print("Enter classroom: ");
                    String classroom = scanner.nextLine();
                    Students newStudent = new Students(id, name, age, address, point, classroom);
                    manage.addStudent(newStudent);
                }
                case 3 -> {
                    System.out.print("Enter ID of student to update point: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Read the new line after reading the integer input.
                    System.out.print("Enter new point: ");
                    double newPoint = scanner.nextDouble();
                    scanner.nextLine(); // Read the new line after reading the double input.
                    manage.updatePoint(updateId, newPoint);
                }
                case 4 -> {
                    System.out.print("Enter ID of student to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); // Read the new line after reading the integer input.
                    manage.removeStudent(removeId);
                }
                case 5 -> {
                    System.out.print("Enter classroom: ");
                    String classToView = scanner.nextLine();
                    manage.viewStudentsByClass(classToView);
                }
                case 6 -> manage.sortByName();
                case 7 -> manage.sortByAge();
                case 8 -> manage.sortByPoint();
                case 0 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
