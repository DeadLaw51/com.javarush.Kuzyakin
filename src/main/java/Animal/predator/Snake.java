package Animal.predator;

public class Snake extends Predator{
    String name = "Snake";
    private double weigth = 15;
    private int maxPopulation = 30;
    private int speed = 1;
    private double maxSatiety = 3;

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
