package bt3.entities;

import bt3.service.Polygon;

public class Rectagle implements Polygon {
    private double lenght;
    private double width;

    public Rectagle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("HCN có chiều dài : "+lenght+" chiều rộng : "+lenght);

    }

    @Override
    public void calArea() {
        System.out.println("HCN có diện tích: "+lenght*width);
    }
}
