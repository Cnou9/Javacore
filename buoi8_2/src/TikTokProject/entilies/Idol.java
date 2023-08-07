package TikTokProject.entilies;

public class Idol {
    private static int auID=0;
    private String name;
    private int id;
    private int followers;
    private String group;

    public Idol(String name, int followers, String group) {
        this.id=++auID;
        this.name = name;
        this.followers = followers;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +" id: "+id+
                "-name: "+name+
                "-followers: "+followers +
                "--group: "+group+
                '}';
    }
}
