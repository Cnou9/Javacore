package lab3;

import lab3.entilies.History;
import lab3.entilies.Worker;
import lab3.Service.WorkerService;
import lab3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerService service = new WorkerService();
        ArrayList<History> histories = new ArrayList<>();
        ArrayList<Worker> workers = new ArrayList<>();

        Menu menu = new Menu();
        menu.handleUserMenu(scanner, service, workers, histories);
    }
}
