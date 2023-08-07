package Ulits;

import entile.Product;

public class Data {
    public Product[] listProduct(){
        //danh sach cac san pham
        Product[] products=new Product[4];
        products[0]=new Product("Samsung",10,10000);
        products[1]=new Product("Nokia",10,15000);
        products[2]=new Product("Apple",10,12000);
        products[3]=new Product("Xiaomi",10,16000);

        return products;
    }
}
