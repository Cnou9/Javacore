import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Input name patient: ");
        String name= sc.nextLine();
        System.out.println("Input age of patient: ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("Input disease of patient: ");
        String disease= sc.nextLine();
        System.out.println("Input admissionDate: ");
        String createdDate= sc.nextLine();
        LocalDate admissionDate=LocalDate.parse(createdDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        Patient patient=new Patient(name,age,disease,admissionDate);
        System.out.println(patient);

        System.out.println("Input name of doctor: ");
        String nameDoctor= sc.nextLine();
        System.out.println("Input age of Doctor: ");
        int ageDoctor=Integer.parseInt(sc.nextLine());
        System.out.println("Input speciality of doctor: ");
        String spec= sc.nextLine();
        System.out.println("Input timeWork of doctor: ");
        double time=Double.parseDouble(sc.nextLine());

        Doctor doctor=new Doctor(nameDoctor,ageDoctor,spec,time);
        System.out.println(doctor);

//        ManageHospital manage=new ManageHospital(patient,doctor);
//        System.out.println(manage);



    }
}
