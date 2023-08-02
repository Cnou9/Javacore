public abstract class VehicleList {

    public double speed;
    public double distance;

    public VehicleList(double speed, double distance) {
        this.speed = speed;
        this.distance = distance;
    }

    public abstract void printInfo();

    public abstract double time();


    }

