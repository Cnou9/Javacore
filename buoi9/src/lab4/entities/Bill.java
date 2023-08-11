package lab4.entities;

import java.util.Scanner;

public class Bill {

    private Customer customer;
    private double oldIndex;
    private double newIndex;


    public Bill(Customer customer, double oldIndex, double newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Bill() {
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double CalculateFee(){
        return (newIndex-oldIndex)*750;
    }

    public void displayInfo(){
        customer.displayInfo();
        System.out.println("Chỉ số cũ: "+oldIndex);
        System.out.println("Chỉ số mới: "+newIndex);
        System.out.println("Số tiền phải trả: "+CalculateFee());
    }

}
