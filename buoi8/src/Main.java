import Service.ProductService;
import View.Menu;
import entile.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);


        //danh sach cac san pham
        Product[] products=new Product[4];
        products[0]=new Product("Samsung",10,10000);
        products[1]=new Product("Nokia",10,15000);
        products[2]=new Product("Apple",10,12000);
        products[3]=new Product("Xiaomi",10,16000);


        Menu menu=new Menu();
        menu.displayMenu();
        int choose=Integer.parseInt(scanner.nextLine());

        ProductService service=new ProductService();
        menu.handleSelect(choose,service,products);

    }
}
