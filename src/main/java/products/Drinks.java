package products;

import java.util.Date;
import java.util.UUID;

public class Drinks extends Product{

    public Date expiryDate;
    public Measurements measurement;

    public Drinks(String name, double price, int quantity, double weight, Date expiryDate, Measurements measurement) {
        super(name, price, quantity, weight);
        this.expiryDate = expiryDate;
        this.measurement = measurement;
    }

    public Drinks(UUID id, String name, double price, int quantity, double weight, Date expiryDate, Measurements measurement) {
        super(id, name, price, quantity, weight);
        this.expiryDate = expiryDate;
        this.measurement = measurement;
    }
}
