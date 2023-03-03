package animals;

public class Bird extends Animal{
    private boolean isItFlying;
    private Lands land;

    public Bird(String name, double weight, Colors color, Places place, boolean isItFlying, Lands land) {
        super(name, weight, color, place);
        this.isItFlying = isItFlying;
        this.land = land;
    }

}
