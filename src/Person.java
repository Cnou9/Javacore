public class Person {
    public static int auId;
    private int id;
    private String name;
    private int age;


    public Person(String name, int age) {
        this.id = ++auId;
        this.name = name;
        this.age = age;
    }

    public static int getAuId() {
        return auId;
    }

    public static void setAuId(int auId) {
        Person.auId = auId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
