package entile;

public class SinhVienBiz extends SInhVienTechmaster {
    private double marketing;
    private double sales;

    public SinhVienBiz(String name, String major, double marketing, double sales) {
        super(name, major);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getPoint() {
        return (2*marketing+sales)/3;
    }

}
