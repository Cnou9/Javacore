package bt5.entities;

public class Book {
    private int id;
    private String name;
    private String topic;
    private String author;
    private int numRemain;

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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumRemain() {
        return numRemain;
    }

    public void setNumRemain(int numRemain) {
        this.numRemain = numRemain;
    }

    public Book(int id, String name, String topic, String author, int numRemain) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.author = author;
        this.numRemain = numRemain;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", author='" + author + '\'' +
                ", numRemain=" + numRemain +
                '}';
    }
}
