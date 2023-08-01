public class Square extends Shape {


    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void printInfo() {
        System.out.println("chu vi: "+getChuVi());
        System.out.println("dien tich: "+getDienTich());
    }

    @Override
    public double getChuVi() {
        return side*4;
    }

    @Override
    public double getDienTich() {
        return side*side;
    }



}
