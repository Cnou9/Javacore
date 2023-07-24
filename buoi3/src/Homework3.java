import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        char tiepTuc;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("input name: ");
            String name=scanner.nextLine();

            System.out.print("input address: ");
            String address= scanner.nextLine();

            System.out.print("input age: ");
            int age=Integer.parseInt(scanner.nextLine());

            System.out.println("name: "+name);
            System.out.println("address: "+address);
            System.out.println("age: "+age);

            System.out.println("Do you want to continues?");
            tiepTuc=scanner.nextLine().charAt(0);
        }
        while(tiepTuc=='y'||tiepTuc=='Y');
        System.out.println("progam stopped");
    }
}
