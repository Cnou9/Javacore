package lab2;
import lab2.service.StudentService;
import lab2.entilies.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        StudentService studentService=new StudentService();
        ArrayList<Student> students=studentService.avgScore(scanner);
        System.out.println(students);

        for(Student s: students) {
           s.displayInfo();
        }
        studentService.percentScore();
    }
}
