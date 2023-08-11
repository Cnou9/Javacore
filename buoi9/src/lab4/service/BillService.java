package lab4.service;

import lab4.entities.Bill;
import lab4.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    public ArrayList<Bill> inputBills(Scanner scanner){
        ArrayList<Bill> bills=new ArrayList<>();

        try {
            System.out.println("Nhập số hộ sử dụng điện : ");
            int n=Integer.parseInt(scanner.nextLine());
            for (int i=0;i<n;i++){
                System.out.println("Nhập tên chủ hộ #"+(i+1)+": ");
                String name= scanner.nextLine();
                System.out.println("Nhập số nhà: ");
                int numHouse=Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập mã số công tơ: ");
                double meterCode=Double.parseDouble(scanner.nextLine());
                System.out.println("Nhâp chỉ số cũ: ");
                double oldIndex=Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập chỉ số mới: ");
                double newIndex=Double.parseDouble(scanner.nextLine());
                Customer customer=new Customer(name,numHouse,meterCode);
                Bill bill=new Bill(customer,oldIndex,newIndex);
                bills.add(bill);
            }
        } catch (Exception e){
            System.out.println("Lỗi");
        }

        return bills;
    }
    public void displayBills(ArrayList<Bill> bills){
        for (Bill bill:bills){
            bill.displayInfo();
        }
    }
}
