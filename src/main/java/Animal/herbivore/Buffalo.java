package Animal.herbivore;

public class Buffalo extends Herbivore{
    String name = "Buffalo";
    private double weigth = 700;
    private int maxPopulation = 10;
    private int speed = 3;
    private double maxSatiety = 100;

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
