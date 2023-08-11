package lab4.entities;

import java.util.Scanner;

public class Customer {
    private String name;
    private int numHouse;
    private double meterCode;

    public Customer(String name, int numHouse, double meterCode) {
        this.name = name;
        this.numHouse = numHouse;
        this.meterCode = meterCode;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public double getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(double meterCode) {
        this.meterCode = meterCode;
    }

    public void displayInfo(){
        System.out.println("Tên chủ hộ: "+this.name);
        System.out.println("Số nhà: "+this.numHouse);
        System.out.println("Mã số công tơ: "+this.meterCode);
    }

}
