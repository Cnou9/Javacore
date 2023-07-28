import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


//        baitap1
//        input infor for objects
        /*System.out.println("nhap id: ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("nhap name: ");
        String name= sc.nextLine();
        System.out.println("nhap price: ");
        Double price=Double.parseDouble(sc.nextLine());
//        put params into objects
        Product pro=new Product();
        pro.setId(id);
        pro.setName(name);
        pro.setPrice(price);
        System.out.println(pro);
        System.out.println("-gia thue san pham: "+pro.priceVAT());*/


//         baitap2
//        input infor for objects
        /*System.out.println("id: ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("name: ");
        String name= sc.nextLine();
        System.out.println("address: " );
        String addr= sc.nextLine();
        System.out.println("age: ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("exper: ");
        int exper=Integer.parseInt(sc.nextLine());
        System.out.println("placeWork: ");
        String placeWork= sc.nextLine();
//        put params into objects
        Employee employee=new Employee(id, name,  age, addr,exper, placeWork);
        System.out.println(employee);*/


//        baitap3
//        input infor for objects
        System.out.println("nahp chieu rong: ");
        double width=Double.parseDouble(sc.nextLine());
        System.out.println("nhap chieu dai: ");
        double length=Double.parseDouble(sc.nextLine());
        Rectangle rectangle=new Rectangle(width,length);
        rectangle.displayInfo();
//        put params into objects
        System.out.println("nhap do dai canh: ");
        double side=Double.parseDouble(sc.nextLine());
        Square square=new Square(side);
        square.displayInfo();

    }
}
