package Animal.predator;

public class Fox extends Predator{
    String name = "Fox";
    private double weigth = 8;
    private int maxPopulation = 30;
    private int speed = 2;
    private double maxSatiety = 2;

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
