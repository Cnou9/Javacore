package TikTokProject.Service;

import TikTokProject.entilies.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    public ArrayList<Idol> createIdol(Scanner scanner) {
        ArrayList<Idol> idols=new ArrayList<>();
        System.out.println("nhap so luong idol: ");
        int numberIdol = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberIdol; i++) {
            System.out.println("nhap ten: ");
            String name = scanner.nextLine();
            System.out.println("nhap email: ");
            String email = scanner.nextLine();
            System.out.println("nhap so nguoi theo doi: ");
            int followers = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap ten group: ");
            String group = scanner.nextLine();
            Idol idol = new Idol(name, followers, group);
            idols.add(idol);
        }
        return idols;
    }
}
