import animals.Chicken;

import static animals.Colors.BROWN;
import static animals.Lands.EUROPE;
import static animals.Places.LAND;
import static animals.Types.HOME;

public class Main {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken("Doris", 1, BROWN, LAND, false, EUROPE, HOME, 50, 5);
        System.out.println(chicken1.countOfEggsPerLife());
    }

}
