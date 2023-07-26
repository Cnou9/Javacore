import java.util.Arrays;
import java.util.Scanner;

public class trenlop {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("nhap n: ");
        int n= Integer.parseInt(scanner.nextLine());
        int[] arrInteger=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("moi ban nhap so thu: "+(i+1));
            int x=Integer.parseInt(scanner.nextLine());
            arrInteger[i]=x;
            System.out.println("so thu "+(i+1)+" la: "+x);
        }
        System.out.println(Arrays.toString(arrInteger));
        for(int i=0;i<n;i++){
//            System.out.println("a["+i+"] = "+arrInteger[i]);

        }*/
        Scanner scanner = new Scanner(System.in);
        /*int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(scanner.nextLine());
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr)+"=");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                arr[i]+=1;
                System.out.print(Arrays.toString(arr));
            }
        }*/


        /*System.out.println("enter n: ");
        int n=Integer.parseInt(scanner.nextLine());
        int arr[]=new int[n];
        int[] arrNew=new int[arr.length+1];
        for(int i=0;i< arr.length;i++){
            System.out.println("nhap gia tri thu " +(i+1)+ " : ");
            int x=Integer.parseInt(scanner.nextLine());
            arr[i]=x;
        }
        System.out.println("array : "+Arrays.toString(arr));
//        sao chep
        System.out.println("nhap vi tri muon chen: ");
        int chen= scanner.nextInt();
        for(int i=0;i<chen;i++){
            arrNew[i]=arr[i];
        }
        System.out.println("arrayNew: "+Arrays.toString(arrNew));

        */
        /*
        System.out.println("gia tri chen: ");
        arrNew[chen]= scanner.nextInt();

        for(int i=chen;i<arr.length;i++){
            arrNew[i+1]=arr[i];
        }

        System.out.println("arrNew "+Arrays.toString(arrNew));*/

        int row;
        int column;
       do {

           System.out.println("enter row: ");
           row = Integer.parseInt(scanner.nextLine());
           System.out.println("enter column: ");
           column = Integer.parseInt(scanner.nextLine());


           int arrB[][] = new int[row][column];
           int arrA[][] = new int[row][column];
           //liet ke
           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   System.out.println("nhap gia tri cho ma tran A a[" + i + "][" + j + "]");
                   int x = Integer.parseInt(scanner.nextLine());
                   arrA[i][j] = x;

               }
           }
           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   System.out.println("nhap gia tri cho ma tran B a[" + i + "][" + j + "]");
                   int y = Integer.parseInt(scanner.nextLine());
                   arrB[i][j] = y;
               }
           }
           //in ra man hinh
           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   System.out.print("arrA[" + i + "][" + j + "]=" + arrA[i][j] + "\t");
               }
               System.out.println();
           }

           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   System.out.print("arrB[" + i + "][" + j + "]=" + arrB[i][j] + "\t");
               }
               System.out.println();
           }
           System.out.println();
           //tinh tong
           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   System.out.print("arrSum[" + i + "][" + j + "]=" + (arrA[i][j] + arrB[i][j]) + "\t");
               }
               System.out.println();
           }
       } while(true);






//        int sum=0;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                if(arr[i][j]%3==0) {
//                    sum+=arr[i][j];
//                }
//                System.out.println("a["+i+"]["+j+"]="+arr[i][j]);
//            }
//        }
//        System.out.println("sum="+sum);
    }
}
