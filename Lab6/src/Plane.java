public class Plane extends VehicleList{
    public Plane(double speed, double distance) {
        super(80, distance);
    }


    @Override
    public void printInfo() {
        System.out.println("thoi gian den noi cua Plane: "+time()+"h");
    }

    @Override
    public double time() {
        return distance/speed;
    }

}
