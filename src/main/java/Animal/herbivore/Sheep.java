package Animal.herbivore;

public class Sheep extends Herbivore{
    String name = "Sheep";
    private double weigth = 70;
    private int maxPopulation = 140;
    private int speed = 3;
    private double maxSatiety = 15;

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
