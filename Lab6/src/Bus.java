import Contanst.Contanst;

public class Bus extends VehicleList{


    @Override
    public double time(double distance) {
        return distance/ Contanst.SPEEDBUS;
    }




}
