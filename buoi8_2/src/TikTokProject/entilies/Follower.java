package TikTokProject.entilies;

public class Follower {
    private int id;
    private int autoID=0;
    private String name;
    private String email;
    private int numberOfLike;

    public Follower(String name, String email, int numberOfLike) {
        this.id=++autoID;
        this.name = name;
        this.email = email;
        this.numberOfLike = numberOfLike;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }
}
