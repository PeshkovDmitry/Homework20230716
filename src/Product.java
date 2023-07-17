public class Product {

    private Double price;

    private String title;

    public Product(String title, Double price) {
        this.price = price;
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

}
