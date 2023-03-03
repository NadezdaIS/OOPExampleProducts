package products;

import java.util.UUID;

public class Product {
    public final UUID id;
    public String name;
    public double price;
    public int quantity;
    public double weight;

// Constructor overloading

    public Product(String name, double price, int quantity, double weight) {
        this.id =  UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }

    public Product(UUID id, String name, double price, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }
    public double calculateDiscount() {
        return 0D;
    }
}
