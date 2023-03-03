package products;

import java.util.UUID;

public class Laptop extends Electronics{
    public float batteryDuration;

    public Laptop(String name, double price, int quantity, double weight, float height, float width, float voltage, Colors color, float batteryDuration) {
        super(name, price, quantity, weight, height, width, voltage, color);
        this.batteryDuration = batteryDuration;
    }

    public Laptop(UUID id, String name, double price, int quantity, double weight, float height, float width, float voltage, Colors color, float batteryDuration) {
        super(id, name, price, quantity, weight, height, width, voltage, color);
        this.batteryDuration = batteryDuration;
    }
}
