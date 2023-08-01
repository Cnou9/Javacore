import java.awt.Shape;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double length=Double.parseDouble(sc.nextLine());
        double width=Double.parseDouble(sc.nextLine());
        double side=Double.parseDouble(sc.nextLine());

        Rectagon rec=new Rectagon(length,width);
        Square sqr=new Square(side);
        sqr.printInfo();
        rec.printInfo();

    }
}
