package lab2.entilies;

public class Student {
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private static int autoID=0;


    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id=++autoID;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }
    public double Calculate(){
        return  (scoreMath + scorePhysic + scoreChemistry) / 3;
    }
    public String rank() {
        double avgScore = (scoreMath + scorePhysic + scoreChemistry) / 3;

        if (avgScore >= 8) return "A";
        else if (avgScore >= 6.5) return "B";
        else return "C";
    }

    public void displayInfo(){
        System.out.println( "id: "+id+" name: "+name+" scoreMath: "+ scoreMath+" scoreChem: "+scoreChemistry+" scorePhy: "+scorePhysic+" avgScore: "+Calculate()+" rank: "+rank());
    }










}
