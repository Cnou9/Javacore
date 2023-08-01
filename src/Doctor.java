public class Doctor extends Person{
    public String speciality;
    private double timeWork;

    public Doctor(String name, int age, String speciality, double timeWork) {
        super(name, age);
        this.speciality = speciality;
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return "Doctor{" +"\t\tid: "+getId()+"name: "+ getName()+"\t\tage: "+getAge()+
                "speciality='" + speciality + '\'' +
                "\t\t timeWork=" + timeWork +
                '}';
    }
}
