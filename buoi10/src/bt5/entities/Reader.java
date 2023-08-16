package bt5.entities;

public class Reader {
    private int id;
    private String name;
    private int numPhone;
    private String address;

    public Reader(int id, String name, int numPhone, String address) {
        this.id = id;
        this.name = name;
        this.numPhone = numPhone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
