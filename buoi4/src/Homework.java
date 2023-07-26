import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = Integer.parseInt(scanner.nextLine());

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Gia tri thu " + (i + 1) + ": ");
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        System.out.println();

        // Chen them phan tu
        System.out.print("Nhap vi tri muon chen: ");
        int posiChen = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap gia tri muon chen: ");
        int valueChen = Integer.parseInt(scanner.nextLine());

        int arrNew[] = new int[arr.length + 1];
        for (int i = 0; i < posiChen; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[posiChen] = valueChen;
        for (int i = posiChen; i < arr.length; i++) {
            arrNew[i + 1] = arr[i];
        }
        System.out.println("Mang sau khi chen: " + Arrays.toString(arrNew));

        // Doi cho phan tu
        // Sao chep mang moi
        int arrNew2[] = Arrays.copyOf(arr, arr.length);

        System.out.print("Nhap vi tri muon hoan doi: ");
        int index1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vi tri muon hoan doi: ");
        int index2 = Integer.parseInt(scanner.nextLine());

        if (index1 >= 0 && index1 < arrNew2.length && index2 >= 0 && index2 < arrNew2.length) {
            int temp = arrNew2[index1];
            arrNew2[index1] = arrNew2[index2];
            arrNew2[index2] = temp;
            System.out.println("Mang ban dau: " + Arrays.toString(arr));
            System.out.println("Mang sau khi hoan doi: " + Arrays.toString(arrNew2));
        } else {
            System.out.println("Vi tri hoan doi khong hop le.");
        }

    }
}
