package View;

import Service.ProductService;
import entile.Product;

public class Menu {
    public void displayMenu() {
        System.out.println("---Menu---");
        System.out.println("1.Hien thi theo ten");
        System.out.println("2.Tim theo ten");
        System.out.println("3.TIm theo id");
        System.out.println("4.TIm so luong duoi 5");
        System.out.println("5.TIm theo muc gia");
        System.out.println("MOi ban chon: ");

    }


    public void handleSelect(int choose, ProductService service, Product[] products){
        boolean continues = true;
        do {
            switch (choose){
                case 1:
                    System.out.println("========= Dánh sách các sản phẩm là: ==========");
                    service.getlistProducts(products);
                    break;
                case 2:
                    System.out.println("Mời b nhập tên sp: ");
                    service.findProductsByName("Nokia", products);
                    break;
                case 3:
                    break;
                case 4:
                    // To DO
                    break;
                case 5:
                    // To DO
                    break;
            }
            System.out.println("Do u want to continues? (Y/N)");
            continues= false;
        } while (continues);
    }
}

