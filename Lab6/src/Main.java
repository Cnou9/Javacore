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

        double speed = 0;
        Bus bus=new Bus(speed,distance);
        Train train=new Train(speed,distance);
        Plane plane=new Plane(speed,distance);
        bus.printInfo();
        train.printInfo();
        plane.printInfo();


    }
}
