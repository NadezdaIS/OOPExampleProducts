package products;

import java.util.UUID;

public class Electronics extends Product{

    public float height;
    public float width;
    public float voltage;
    public Colors color;

    public Electronics(String name, double price, int quantity, double weight, float height, float width, float voltage, Colors color) {
        super(name, price, quantity, weight);
        this.height = height;
        this.width = width;
        this.voltage = voltage;
        this.color = color;
    }

    public Electronics(UUID id, String name, double price, int quantity, double weight, float height, float width, float voltage, Colors color) {
        super(id, name, price, quantity, weight);
        this.height = height;
        this.width = width;
        this.voltage = voltage;
        this.color = color;
    }

  //  public String calculateElectricCost (){
    //    return "Cost = " this.voltage * this.height;
  //  }
}
