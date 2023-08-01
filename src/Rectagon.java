public class Rectagon extends Shape{
    private double length;
    private double width;



    public Rectagon() {
    }

    public Rectagon(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getChuVi(){
        return 2*(length+width);
    }
    public double getDienTich(){
        return length*width;
    }
    @Override
    public void printInfo() {
        System.out.println("chu vi: "+getChuVi());
        System.out.println("dien tich: "+getDienTich());
    }


}
