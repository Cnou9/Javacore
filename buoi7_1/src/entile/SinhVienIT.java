package entile;

public class SinhVienIT extends SInhVienTechmaster {
    private double java;
    private double html;
    private double css;

    public SinhVienIT(String name, String major, double java, double html, double css) {
        super(name, major);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getPoint() {
        return (2*java+html+css)/4;
    }



}
