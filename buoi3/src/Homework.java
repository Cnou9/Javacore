import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap n : ");
        int n= Integer.parseInt(scanner.nextLine());


//        bai1
        /*int tong = 0;
        int tich=1;
        for(int i=1;i<=n;i++){
            tong+=i;
            tich*=i;
        }
        System.out.println("tong = "+tong);
        System.out.println("tich = "+tich);*/


//        bai2 for
        /*int tongchan=0;
        for(int i=2;i<=n;i+=2){
            tongchan+=i;
        }
        System.out.println("tong chan : "+tongchan);*/


//        bai2 while
        /*int tongchan2=0;
        while(n>0){
            tongchan2+=n;
            n-=2;
        }
        System.out.println("tong chan 2 = "+tongchan2);*/


//        bai2 do-while
        int tongchan3=0;
        do{
            tongchan3+=n;
            n-=2;
        }
        while (n>=0);
        System.out.println("tong chan 3 = "+ tongchan3);
    }
}
