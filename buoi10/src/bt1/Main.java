package bt1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tittle: ");
        String title= scanner.nextLine();
        System.out.println("Nhập author: ");
        String author= scanner.nextLine();
        System.out.println("Nhập publicDate: ");
        String publicDate= scanner.nextLine();
        System.out.println("Nhập rate: ");
        double rate=Integer.parseInt(scanner.nextLine());
        News news=new News(title,author,publicDate,rate);
        news.display();



    }
}
