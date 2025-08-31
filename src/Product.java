// Abstacción de un producto
public class Product {

    // Atributos
    private String name;
    private double price;
    private int quantity;
    private String brand;
    private String category;

    // Constructores - Polimorfismo de constructores
    public Product() {
    }

    // Constructores - Polimorfismo de constructores
    public Product(String name, double price, int quantity, String brand, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.category = category;
    }

    // Constructores - Polimorfismo de constructores
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "[" + name + " | " + brand + " | $" + price + " | Cant: " + quantity + " | Cat: " + category + "]";
    }

}
