package lab3.Service;

import lab3.entilies.History;
import lab3.entilies.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker createAddWorker(Scanner scanner){
        int age;
        double salary;
        do {
            try {
                System.out.println("NHap thong tin: ");
                System.out.println("nhap ten: ");
                String name= scanner.nextLine();
                System.out.println("nhap tuoi: ");
                age=Integer.parseInt(scanner.nextLine());
                System.out.println("nhap dia diem lam viec: ");
                String workPlace= scanner.nextLine();
                System.out.println("nhap luong: ");
                salary=Double.parseDouble(scanner.nextLine());
                return new Worker(name,age,salary,workPlace);
            } catch (Exception e){
                //System.out.println("Exception: "+e);
                System.out.println("moi nhap lai: ");
            }
        } while (true);
    }

    public void changeSalary(double salaryUpdated, ArrayList<Worker> workers,ArrayList<History> histories,String id,String status){
        for (Worker w : workers) {
            if (w.getId().equalsIgnoreCase(id)) {

                History history = new History(w, salaryUpdated + w.getSalary(), status);
                w.setSalary((w.getSalary()+salaryUpdated));
                histories.add(history);
                break;
            }
        }
    }


}




