package bt4.service;

import bt4.entities.Student;

import java.util.Scanner;

public class StudentService {
    public void createStudent(Scanner scanner){
        do {
            try {
                System.out.println("Thông tin học sinh:");
                System.out.println("Nhập tên: ");
                String name= scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                int age=Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập điểm: ");
                double marks=Double.parseDouble(scanner.nextLine());
                Student student=new Student(name,age,marks);
                student.display();
            } catch (Exception e){
                System.out.println("Nhập lại");
            }
        } while (true);



    }
}
