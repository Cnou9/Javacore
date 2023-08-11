package lab3.view;

import lab3.Service.WorkerService;
import lab3.entilies.History;
import lab3.entilies.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("1- Add worker");
        System.out.println("2- Up salary");
        System.out.println("3- Down salary");
        System.out.println("4- Display information");
        System.out.println("5- EXIT");
    }

    public int selectMenu(Scanner scanner){
        do {
            System.out.println("Please choose: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("try again!");
            }
        } while (true);
    }
    public void handleUserMenu(Scanner scanner, WorkerService service, ArrayList<Worker> workers,ArrayList<History> histories){
        do {

            displayMenu();
            int choose = selectMenu(scanner);


            switch (choose) {
                case 1:
                    Worker worker=service.createAddWorker(scanner);
                    workers.add(worker);
                    System.out.println(workers);
                    break;
                case 2:
                    System.out.println("Muon tang luong ai? Nhap ID: ");
                    String idUp = scanner.nextLine();
                    System.out.println("nhap so luong tang: ");
                    double salaryMore = Double.parseDouble(scanner.nextLine());
                    service.changeSalary(salaryMore, workers,histories, idUp, "Up");

                    break;
                case 3:
                    System.out.println("Muon tru luong ai? Nhap ID: ");
                    String idDown = scanner.nextLine();
                    System.out.println("nhap so luong bi tru: ");
                    double salaryLess = Double.parseDouble(scanner.nextLine());
                    service.changeSalary(-salaryLess, workers,histories, idDown, "Down");

                    break;
                case 4:
                    System.out.println(histories);
                    break;
            }
            System.out.println("do you want continue? :");
            String ans = scanner.nextLine();
        }
            while (true) ;


        }




    }


