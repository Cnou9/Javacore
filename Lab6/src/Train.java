public class Train extends VehicleList{
    public Train(double speed, double distance) {
        super(40, distance);
    }

    @Override
    public void printInfo() {
        System.out.println("thoi gian den noi cua Train: "+time()+"h");
    }

    @Override
    public double time() {
        return distance/speed;
    }
}
