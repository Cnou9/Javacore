public class Square extends Shape{
    public double side;


    public Square(double side) {
        this.side = side;
    }

    @Override
    public double chuVi() {
        return side*4;
    }

    @Override
    public double dienTich() {
        return side*side;
    }

    public void displayInfo(){
        System.out.println("Hinh vuong: ");
        System.out.println("canh : "+side);
        System.out.println("dien tich: "+dienTich());
        System.out.println("chu vi: "+chuVi());
    }
}
