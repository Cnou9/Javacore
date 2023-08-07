package TikTokProject.entilies;

public class Song {
    private int id;
    private int autoID=0;
    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.id=++autoID;
        this.name = name;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
