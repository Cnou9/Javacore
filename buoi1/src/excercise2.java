import java.util.Scanner;

public class excercise2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("nhập nhiệt độ F: ");
        double k = input.nextDouble();
        double c = (k - 32) * 5 / 9;
        System.out.println(c);

    }
}
