package entile;

public class Member {
    private static int autoID=0;
    private int id;
    private String name;
    private String dob;
    private String job;

    public Member(String name, String dob, String job) {
        this.id=++autoID;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }



    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
}
