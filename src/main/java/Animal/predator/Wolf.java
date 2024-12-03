package Animal.predator;


public class Wolf extends Predator{
    String name = "Wolf";
    private double weigth = 50;
    private int maxPopulation = 30;
    private int speed = 3;

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public double getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }

    private double maxSatiety = 8;
}
