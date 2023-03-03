package animals;

public class Chicken extends Bird{
    private Types type;
    private int countOfEggs;
    private int maxAge;

    public Chicken(String name, double weight, Colors color, Places place, boolean isItFlying, Lands land,
                   Types type, int countOfEggs, int maxAge) {
        super(name, weight, color, place, isItFlying, land);
        this.type = type;
        this.countOfEggs = countOfEggs;
        this.maxAge = maxAge;
    }
    public int countOfEggsPerLife(){
        return this.countOfEggs*this.maxAge;
    }
}
