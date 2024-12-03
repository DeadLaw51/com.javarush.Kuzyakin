package Animal.predator;

public class Eagle extends Predator {
    String name = "Eagle";
    private double weigth = 6;
    private int maxPopulation = 20;
    private int speed = 3;
    private double maxSatiety = 1;

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public int getSpeed() {
        return speed;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }
}
