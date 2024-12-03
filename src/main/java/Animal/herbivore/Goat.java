package Animal.herbivore;

public class Goat extends Herbivore{
    String name = "Goat";
    private double weigth = 60;
    private int maxPopulation = 140;
    private int speed = 3;
    private double maxSatiety = 10;

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
