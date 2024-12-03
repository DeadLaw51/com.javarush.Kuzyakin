package Animal.predator;

public class Bear extends Predator{
    String name = "Bear";
    private double weigth = 500;
    private int maxPopulation = 5;
    private int speed = 2;
    private double maxSatiety = 80;

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
