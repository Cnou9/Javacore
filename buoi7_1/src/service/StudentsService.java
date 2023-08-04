package service;

import entile.SinhVienBiz;
import entile.SinhVienIT;

import java.util.Scanner;

public class StudentsService {
    Scanner scanner=new Scanner(System.in);

    public SinhVienBiz createStudentBiz(Scanner scanner, String name, String major){
        System.out.println("moi ban nhap diem markerting: ");
        double marketing=Double.parseDouble(scanner.nextLine());
        System.out.println("moi ban nhap diem sales: ");
        double sales=Double.parseDouble(scanner.nextLine());
        return new SinhVienBiz(name,major,marketing,sales);


    }
    public SinhVienIT createStudentIT(Scanner scanner, String name, String major){
        System.out.println("moi ban nhap diem java ");
        double java=Double.parseDouble(scanner.nextLine());
        System.out.println("moi ban nhap diem html ");
        double html=Double.parseDouble(scanner.nextLine());
        System.out.println("moi ban nhap diem css ");
        double css=Double.parseDouble(scanner.nextLine());

       return new SinhVienIT(name,major,java,html,css);
    }
}
