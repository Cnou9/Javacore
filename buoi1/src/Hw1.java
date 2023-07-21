import java.util.Scanner;
public class Hw1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("hàng nhập kho: ");
        String mathang= input.nextLine();

        System.out.println("nhập ngày sinh (yyyy/MM/dd): ");
        String birthday= input.nextLine();

        System.out.println("nhập ngày nhập hàng dạng yyyy/MM/dd HH:mm:ss: ");
        String ngaynhaphang= input.nextLine();

        System.out.println("nhập thời gian (HH:mm:ss): ");
        String time= input.nextLine();

    }
}
