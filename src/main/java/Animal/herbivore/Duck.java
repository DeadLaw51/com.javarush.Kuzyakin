package Animal.herbivore;

public class Duck extends Herbivore{
    String name = "Duck";
    private double weigth = 1;
    private int maxPopulation = 200;
    private int speed = 4;
    private double maxSatiety = 0.15;

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
