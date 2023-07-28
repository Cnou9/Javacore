public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double priceVAT(){
        return price*0.1;
    }
    @Override
    public String toString() {
        return "Product :" + "\n"+
                "-id : "+id +"\n"+
                "-name: "+name+"\n"+
                "-price: "+price
                ;
    }
}
