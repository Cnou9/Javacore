public class Rectangle extends Shape{
    private double width;
    private double lenghth;

    public Rectangle(double width, double lenghth) {
        this.width = width;
        this.lenghth = lenghth;
    }

    @Override
    public double chuVi() {
        return 2*(lenghth+width);
    }

    @Override
    public double dienTich() {
        return lenghth*width;
    }
    public void displayInfo(){
        System.out.println("Hinh chu nhat: ");
        System.out.println("chieu dai: "+lenghth);
        System.out.println("chieu rong: "+width);
        System.out.println("dien tich: "+dienTich());
        System.out.println("chu vi: "+chuVi());
    }
}
