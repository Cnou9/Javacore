import Contanst.Contanst;

public class Train extends VehicleList{
    public static final double speed= 40;


    @Override
    public double time(double distance) {
        return distance/ Contanst.SPEEDTRAIN;
    }


}
