public class Employee extends Person {
    private double experience;
    private String placeWork;


    public Employee(int id, String name, int age, String address, double experience, String placeWork) {
        super(id, name, age, address);
        this.experience = experience;
        this.placeWork = placeWork;
    }

    public double getExperience() {
        return experience;
    }


    @Override
    public String toString() {
        return "Employee : " + "\n" +
                "id: " + getId() + "\n" +
                "name: " + getName() + "\n" +
                "address: " + getAddress() + "\n" +
                "age: " + getAddress() + "\n" +
                "exper: " + experience + "\n" +
                "placeWork: " + placeWork;
    }
}
