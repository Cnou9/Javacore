import Contanst.Contanst;

public class Plane extends VehicleList{
    public static final double speed= 80;


    @Override
    public double time(double distance) {
        return distance/ Contanst.SPEEDPLANE;
    }


}
