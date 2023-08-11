package lab2.service;

import lab2.entilies.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    double scoreMath;
    double scorePhysic;
    double scoreChemistry;

    public ArrayList<Student> avgScore(Scanner scanner) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("nhap so luong hoc sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("nhap ten hoc sinh #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("nhap diem toan cua hoc sinh #" + (i + 1) + ": ");
            scoreMath = Double.parseDouble(scanner.nextLine());
            System.out.println("nhap diem sinh hoc cua hoc sinh #" + (i + 1) + ": ");
            scorePhysic = Double.parseDouble(scanner.nextLine());
            System.out.println("nhap diem hoa cua hoc sinh #" + (i + 1) + ": ");
            scoreChemistry = Double.parseDouble(scanner.nextLine());
            Student student = new Student(name, scoreMath, scorePhysic, scoreChemistry);
            students.add(student);
        }
        return students;
    }

    public void percentScore() {
        ArrayList<Student> students=new ArrayList<>();
        int countA = 0, countB = 0, countC = 0;
        for (Student s : students) {
            if (s.rank().equalsIgnoreCase("rank A")) countA++;
            else if (s.rank().equalsIgnoreCase("rank B")) countB++;
            else if (s.rank().equalsIgnoreCase("rank C")) countC++;
        }
        System.out.println("rank A: "+(countA*100/students.size()));
        System.out.println("rank B: "+(countB*100/students.size()));
        System.out.println("rank C: "+(countC*100/students.size()));

    }









}

