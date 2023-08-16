package bt1;

public class News implements INews{
    private String title;
    private String author;
    private String publicDate;
    private double rate;

    public News(String title, String author, String publicDate, double rate) {
        this.title = title;
        this.author = author;
        this.publicDate = publicDate;
        this.rate = rate;
    }

    @Override
    public void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: " + author);
        System.out.println("PublicDate: "+publicDate);
        System.out.println("Rate: "+rate);
    }
}
