import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int sum = 0;
        char tiepTuc;

        do{
            System.out.print("Enter integer n:");
            int n=Integer.parseInt(scanner.nextLine());
            sum+=n;

            System.out.print("Do you want to continue?? (Y/N): ");
            tiepTuc=scanner.next().charAt(0);
            scanner.nextLine();
        }
        while(tiepTuc=='y'|| tiepTuc=='Y');

        System.out.print("tong cac so vua nhap : "+ sum);

    }
}
