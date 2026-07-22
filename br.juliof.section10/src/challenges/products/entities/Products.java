package challenges.products.entities;

public class Products {
    // Variables
    private String description;
    private double price;

    // Constructors
    public Products(){
    }
    public Products(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Getters
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}