public class Bus extends VehicleList{

    public Bus(double speed, double distance) {
        super(20, distance);
    }

    @Override
    public void printInfo() {
        System.out.println("thoi gian den noi cua Bus: "+time() +"h");
    }


    @Override
    public double time() {
        return distance/speed ;
    }


}
