import java.util.Scanner;

public class trenlop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        bai1
        /*System.out.println("nhap a :");
        double a = scanner.nextDouble();
        System.out.println("nhap b: ");
        double b = scanner.nextDouble();
        double x = -b/a;
        if(a==0&&b==0){
            System.out.println("vo so nghiem");
        } else if(a==0){
            System.out.println("vo nghiem");
        }
        else System.out.println("nghiem la: " + x);*/


//        bai2
        /*System.out.println("nhap a: ");
        double a= scanner.nextDouble();
        System.out.println("nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("nhap c: ");
        double c = scanner.nextDouble();
        if (a==0){
            if(b==0&&c==0){
                System.out.println("vo so nghiem");
            } else if(b==0){
                System.out.println("vo nghiem");
            }
            else {
                double x = -c/b;
                System.out.println("nghiem la: " + x);
            }
        } else {
            double delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("vo nghiem");
            } else if(delta==0){
                double x=-b/a;
                System.out.println("nghiem kep la: "+x);
            } else {
                double x1= (-b-Math.sqrt(delta))/(2*a);
                double x2= (-b+Math.sqrt(delta))/(2*a);
                System.out.println("phuong trinh co 2 nghiem : " + x1+ "\t" + x2);
            }

        }*/

//      bai3
        /*System.out.println("nhap so dien : ");
        double number= scanner.nextDouble();
        if (number >= 0 && number <= 50) {
            double fee=number*1000;
            System.out.println("so tien dien: "+fee);

        }
        else if(number>50){
            double fee=(number-50)*1200+50*1000;
            System.out.println("so tien dien: "+fee);
        }
*/

//        bai4
        /*String username = "techmaster";
        String pass= "hoclacoviec";

        System.out.println("nhap username: ");
        String userLogin= scanner.nextLine();

        System.out.println("nhap pass: ");
        String passLogin= scanner.nextLine();

        if(userLogin.equals(username) && passLogin.equals(pass)){
            System.out.println("dang nhap thanh cong");

        } else System.out.println("tai khoan khong ton tai");*/


        /*System.out.println("nhap hang xe: ");
        String brandCar= scanner.nextLine();
        switch (brandCar){
            case "Toyota" :
                System.out.println("made in Japan in 1937");
                break;
            case "Audi" :
                System.out.println("made in Germany in 1909");
                break;
            case "Mercedes" :
                System.out.println("made in Germany in 1904");
                break;
            default:
                System.out.println("No infor");*/


        /*System.out.println("nhap a: ");
        double a= Double.parseDouble(String.valueOf(scanner.nextDouble()));

        System.out.println("nhap phep toan: ");
        String pheptoan= scanner.next();

        System.out.println("nhap b: ");
        double b= Double.parseDouble(String.valueOf(scanner.nextDouble()));



        switch (pheptoan){
            case "+" :
                System.out.printf("a + b = ");
                System.out.println(a+b);
                break;
            case "-":
                System.out.printf("a - b = ");
                System.out.println(a-b);
                break;
            case "x" :
                System.out.println("a x b = " + a*b);
                break;
            case "/" :
                System.out.println("a / b = " + a/b);
                break;
            case "%" :
                System.out.println("a % b = "+a%b);
                break;
            case "=" :
                System.out.printf("a = b : ");
                System.out.println(a==b);
                break;
            default:
                System.out.println("Bieu thuc khong hop le");*/



//        VONG LAP FOR
        System.out.println("nhap n : ");
        int n= Integer.parseInt(scanner.nextLine());

        int tong = 0;
        int tich=1;
        for(int i=1;i<=n;i++){
            tong+=i;
            tich*=i;
        }
        System.out.println("tong = "+tong);
        System.out.println("tich = "+tich);

        int tongchan=0;
        for(int i=2;i<=n;i+=2){
            tongchan+=i;
        }
        System.out.println("tong chan : "+tongchan);

        int tongchan2=0;
        while(n>0){
            tongchan2+=n;
            n-=2;
        }
        System.out.println("tong chan 2 = "+tongchan2);

    }
}