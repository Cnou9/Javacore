import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double distance;
        do{
                System.out.println("nhap quang duong cac phuong tien can di : ");
                distance=Double.parseDouble(sc.nextLine());

                if(distance<0) System.out.println("Invalid Vui long nhap lai!");
        } while (distance<0);

        Bus bus=new Bus();
        Train train=new Train();
        Plane plane=new Plane();
        System.out.println(bus.time(distance));
        System.out.println(train.time(distance));
        System.out.println(plane.time(distance));


    }
}
