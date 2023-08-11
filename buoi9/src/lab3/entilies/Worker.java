package lab3.entilies;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Worker {
    private static int autoId;
    private String id;
    private static int autoID=0;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    private double salary;
    private String workPlace;
    public Worker(String name, int age, double salary, String workPlace) {
        this.id ="W"+ ++autoID;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workPlace = workPlace;

    }
    public ArrayList<History> getHistories() {
        return histories;
    }

    public void setHistories(ArrayList<History> histories) {
        this.histories = histories;
    }

    private ArrayList<History> histories = new ArrayList<>();



    public String getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }


}
