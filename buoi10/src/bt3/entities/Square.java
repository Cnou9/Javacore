package bt3.entities;

import bt3.service.Polygon;

public class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        System.out.println("Hình vuông có cạnh : "+side);


    }

    @Override
    public void calArea() {
        System.out.println("Hình vuông có diện tích: "+side*side);
    }
}
