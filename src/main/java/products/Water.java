package products;

import java.util.Date;
import java.util.UUID;

public class Water extends Drinks {
    private WaterType type;

    public Water(String name, double price, int quantity, double weight, Date expiryDate, Measurements measurement, WaterType type) {
        super(name, price, quantity, weight, expiryDate, measurement);
        this.type = type;
    }

    public Water(UUID id, String name, double price, int quantity, double weight, Date expiryDate, Measurements measurement, WaterType type) {
        super(id, name, price, quantity, weight, expiryDate, measurement);
        this.type = type;
    }

    public WaterType getType() {
        return this.type;
    }
}
