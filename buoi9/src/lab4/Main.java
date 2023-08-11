package lab4;

import lab4.entities.Bill;
import lab4.entities.Customer;
import lab4.service.BillService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Bill> bills=new ArrayList<>();
        BillService billService=new BillService();

        bills=billService.inputBills(scanner);
        billService.displayBills(bills);
    }
}
