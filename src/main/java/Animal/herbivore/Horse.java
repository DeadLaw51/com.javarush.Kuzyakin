package Animal.herbivore;

public class Horse extends Herbivore{
    String name = "Horse";
    private double weigth = 400;
    private int maxPopulation = 20;
    private int speed = 4;
    private double maxSatiety = 60;

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
