package bt3.view;

import bt3.entities.Rectagle;
import bt3.entities.Square;

import java.util.Scanner;

public class Menu {
    public void createRectagle(Scanner scanner){
        System.out.println("Nhập chiều dài: ");
        double length=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiểu rộng: ");
        double width=Double.parseDouble(scanner.nextLine());
        Rectagle rectagle=new Rectagle(length,width);
        rectagle.display();
        rectagle.calArea();
    }
    public void createSquare(Scanner scanner){
        System.out.println("Nhập độ dài cạnh: ");
        double side=Double.parseDouble(scanner.nextLine());
        Square square=new Square(side);
        square.display();
        square.calArea();
    }
}
