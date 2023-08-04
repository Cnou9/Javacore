package entile;

public class SInhVienTechmaster {
    private String name;
    private String major;


    public SInhVienTechmaster(String name, String major){
        this.name = name;
        this.major = major;
    }

    public double getPoint() {
        return 0;
    }


    protected String getHocLuc(){
        double point=getPoint();
        if(point>=8) return "Gioi";
        else if(point>=6.5) return "Kha";
        else if(point>=5) return "trung binh";
        else return "yeu";
    }

    protected void printInfo(){
        System.out.println("ho va ten : "+name);
        System.out.println("chuyen nganh : "+major);
        System.out.println("diem : "+getPoint());
        System.out.println("hoc luc : "+getHocLuc());
    }

    @Override
    public String toString() {
        return "SInhVienTechmaster{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", diem='"+ getPoint()+'\''+
                ", hoc luc='"+ getHocLuc()+'\''+
                '}';
    }
}
