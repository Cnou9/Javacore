package bt4.entities;

import bt4.service.Iclassification;

public class Student implements Iclassification {
    private String name;
    private int age;
    private double marks;


    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;

    }

    @Override
    public void classify() {
        if(marks>=8) System.out.println("A");
        else if(marks>6.5) System.out.println("B");
        else System.out.println("C");
    }

    @Override
    public void display() {
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("Điểm: "+marks);

        System.out.print("Xếp loại: ") ;
        classify();
    }
}
